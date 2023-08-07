package com.farmerProject.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.farmerProject.entities.Crop;
import com.farmerProject.entities.Farmer;
import com.farmerProject.payload.CropDto;
import com.farmerProject.repository.CropRepository;
import com.farmerProject.repository.FarmerRepository;
import com.farmerProject.service.CropService;

@Service
public class CropServiceImpl implements CropService {
	CropRepository cropRepository;
	FarmerRepository farmerRepository;

	CropServiceImpl(CropRepository cropRepository, FarmerRepository farmerRepository) {
		this.cropRepository = cropRepository;
		this.farmerRepository = farmerRepository;
	}

	@Override
	public CropDto createCrop(long id, Crop crop) {
		Farmer farmer = farmerRepository.findById(id).orElseThrow();

		// set farmer to the crop entity
		crop.setFarmer(farmer);
		// save new crop to the crop table
		Crop newCrop = cropRepository.save(crop);
		return mapToDto(newCrop);

	}

	@Override
	public List<CropDto> getCropsByFarmerId(long farmerId) {
		List<Crop> crops = cropRepository.findByFarmerId(farmerId);
		return crops.stream().map(crop -> mapToDto(crop)).collect(Collectors.toList());
	}

	@Override
	public CropDto getCropById(long farmerId, long cropId) {
		Farmer farmer = farmerRepository.findById(farmerId).orElseThrow();
		Crop crop = cropRepository.findById(cropId).orElseThrow();

		if (farmer.getId() != crop.getFarmer().getId()) {
			System.out.println("Id is not mathcing something error is there...  cropServiceImple");
			return null;

		} else {
			return mapToDto(crop);

		}
	}

	private CropDto mapToDto(Crop crop) {
		CropDto dto = new CropDto();
		dto.setId(crop.getId());
		dto.setName(crop.getName());
		dto.setQuantity(crop.getQuantity());

		return dto;
	}

	private Crop mapToEntity(CropDto dto) {
		Crop crop = new Crop();
		crop.setId(dto.getId());
		crop.setName(dto.getName());
		crop.setQuantity(dto.getQuantity());

		return crop;
	}

	@Override
	public void deleteCropById(long farmerId, long cropId) {
		Farmer farmer = farmerRepository.findById(farmerId).orElseThrow();
		Crop crop = cropRepository.findById(cropId).orElseThrow();
		if (farmer.getId() != crop.getFarmer().getId()) {
			System.out.println("Something wrong in deleteCropById ... CropServiceImpl");
		} else {
			cropRepository.delete(crop);
		}

	}

}
