package com.daniallio.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

	
	
	
	@GetMapping("/productsServiceFallBackMethod")
	public String productsServiceFallBackMethod() {
		return "Products service is taking longer. Pleas try again";
		
	}
	
}
