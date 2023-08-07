package com.farmerProject.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.farmerProject.entities.Farmer;
import com.farmerProject.repository.FarmerRepository;
import com.farmerProject.service.FarmerService;

@Service
public class FarmerServiceImpl implements FarmerService {

	FarmerRepository farmerRepository;

	public FarmerServiceImpl(FarmerRepository farmerRepository) {
		this.farmerRepository = farmerRepository;
	}

	@Override
	public Farmer createFarmer(Farmer farmer) {
		Farmer farmerObj = farmerRepository.save(farmer);
		return farmerObj;

	}

	@Override
	public List<Farmer> getAllFarmer() {
		List<Farmer> list = farmerRepository.findAll();
		return list;
	}

	@Override
	public Farmer getFarmerById(long id) {
		Farmer farmer = farmerRepository.findById(id).orElse(null); // Here I can throw not found exception work on it
		return farmer;
	}

	@Override
	public Farmer updateFarmer(Farmer farmer, long id) {
		Farmer farmerObj = farmerRepository.findById(id).orElse(null);
		farmerObj.setName(farmer.getName());
		farmerObj.setContact(farmer.getContact());
		farmerObj.setEmail(farmer.getEmail());
		farmerObj.setAddress(farmer.getAddress());

		Farmer updateFarmer = farmerRepository.save(farmerObj);

		return updateFarmer;

	}

	@Override
	public void deleteFarmer(long id) {
		Farmer farmer = farmerRepository.findById(id).orElseThrow();
		farmerRepository.delete(farmer);

	}

}
