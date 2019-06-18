package com.pet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome ";
		
	}

}
