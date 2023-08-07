package com.farmerProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmerProject.entities.Crop;

@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {
	List<Crop> findByFarmerId(long farmerId);

}
