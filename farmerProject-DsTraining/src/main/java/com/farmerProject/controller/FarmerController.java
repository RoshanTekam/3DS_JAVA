package com.farmerProject.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.farmerProject.entities.Crop;
import com.farmerProject.entities.Farmer;
import com.farmerProject.service.FarmerService;

@Controller // don't use RestController here
@RequestMapping("api/farmers")
public class FarmerController {
	FarmerService farmerService;

	FarmerController(FarmerService farmerService) {
		this.farmerService = farmerService;
	}

	// Display the farmer page
	@RequestMapping("/home")
	public String homePage(Model model) {
		model.addAttribute("title", "Home_page");
		return "farmerHomePage";
	}

	@RequestMapping("/addCrop")
	public String addCrop(Model model) {
		model.addAttribute("title", "Add_crop");
		model.addAttribute("crop", new Crop());
		return "addCrop";
	}
//	public String getCropData()

	@PostMapping
	public ResponseEntity<Farmer> createFarmer(@RequestBody Farmer farmer) {
		{
			Farmer farmerObj = farmerService.createFarmer(farmer);
			return new ResponseEntity<>(farmerObj, HttpStatus.CREATED); // ResponseEntity.ok(farmerObj)
		}

	}

	@GetMapping
	public ResponseEntity<List<Farmer>> getAllFarmer() {
		List<Farmer> list = farmerService.getAllFarmer();
		return new ResponseEntity<List<Farmer>>(list, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Farmer> getFarmerById(@PathVariable(name = "id") long id) {
		Farmer farmer = farmerService.getFarmerById(id);
		return ResponseEntity.ok(farmer);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Farmer> updateFarmerById(@RequestBody Farmer farmer, @PathVariable(name = "id") long id) {
		Farmer updateFarmer = farmerService.updateFarmer(farmer, id);
		return ResponseEntity.ok(updateFarmer);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteFarmer(@PathVariable(name = "id") long id) {
		farmerService.deleteFarmer(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
