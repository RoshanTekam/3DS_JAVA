package com.farmerProject.service;

import java.util.List;

import com.farmerProject.entities.Farmer;

public interface FarmerService {

	Farmer createFarmer(Farmer farmer);

	List<Farmer> getAllFarmer();

	Farmer getFarmerById(long id);

	Farmer updateFarmer(Farmer farmer, long id);

	void deleteFarmer(long id);

}
