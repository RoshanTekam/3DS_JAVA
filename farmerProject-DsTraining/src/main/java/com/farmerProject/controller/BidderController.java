package com.farmerProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/")
public class BidderController {

	@RequestMapping("/about")
	public String homePage(Model model) {
		model.addAttribute("title", "Home_page");
		return "addCrop";
	}

	@RequestMapping("/home")
	public String showFarmerPage(Model model) {
		model.addAttribute("title", "Home page");
		return "addCrop";
	}

}
