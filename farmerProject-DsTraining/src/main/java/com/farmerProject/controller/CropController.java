package com.farmerProject.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmerProject.entities.Crop;
import com.farmerProject.payload.CropDto;
import com.farmerProject.service.CropService;

@RestController
@RequestMapping("/api/")
public class CropController {

	CropService cropService;

	CropController(CropService cropService) {
		this.cropService = cropService;
	}

	@PostMapping("/farmers/{farmerId}/crops")
	public ResponseEntity<CropDto> createCrop(@PathVariable(value = "farmerId") long farmerId, @RequestBody Crop crop) {

		CropDto newCropDto = cropService.createCrop(farmerId, crop);

		return new ResponseEntity<>(newCropDto, HttpStatus.CREATED);
	}

	@GetMapping("/farmers/{farmerId}/crops")
	public ResponseEntity<List<CropDto>> getCropByFarmerId(@PathVariable(value = "farmerId") long farmerId) {
		List<CropDto> crops = cropService.getCropsByFarmerId(farmerId);
		return new ResponseEntity<>(crops, HttpStatus.OK);
	}

	@GetMapping("/farmers/{farmerId}/crops/{cropId}")
	public ResponseEntity<CropDto> getCropById(@PathVariable(value = "farmerId") long farmerId,
			@PathVariable(value = "cropId") long cropId) {
		CropDto c = cropService.getCropById(farmerId, cropId);
		return new ResponseEntity<>(c, HttpStatus.OK);
	}
 
	@DeleteMapping("/farmers/{farmerId}/crops/{cropId}")
	public ResponseEntity<String> deleteCrop(@PathVariable(value = "farmerId") long farmerId,
			@PathVariable(value = "cropId") long cropId) {
		cropService.deleteCropById(farmerId, cropId);
		return new ResponseEntity<String>("successfully deleted ...", HttpStatus.OK);
	}
}
