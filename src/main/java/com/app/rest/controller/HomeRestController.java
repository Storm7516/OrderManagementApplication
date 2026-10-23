package com.app.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeRestController {
	
	@GetMapping
	public String getLandingPageDetails() {
		return "Welcome To Order Management Service Page.";
		
	}

}
