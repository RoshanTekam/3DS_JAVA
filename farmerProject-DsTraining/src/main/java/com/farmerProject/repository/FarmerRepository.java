package com.farmerProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmerProject.entities.Farmer;

@Repository // it not cumpulsory to add repository annotation because SimpleJpaRepository
			// internally implement it and
public interface FarmerRepository extends JpaRepository<Farmer, Long> {

}
