package com.farmerProject.service;

import java.util.List;

import com.farmerProject.entities.Crop;
import com.farmerProject.payload.CropDto;

public interface CropService {
	public CropDto createCrop(long farmerId, Crop crop);

	public List<CropDto> getCropsByFarmerId(long farmerId);

	public CropDto getCropById(long farmerId, long cropId);

	public void deleteCropById(long farmerId, long cropId);

}
