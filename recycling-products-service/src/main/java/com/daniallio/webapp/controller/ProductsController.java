package com.daniallio.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniallio.webapp.entities.ProductsList;
import com.daniallio.webapp.services.ProductsService;



@Controller
@RequestMapping("api/products")
public class ProductsController {

	
	
	@Autowired
	ProductsService productService;
	
	
	@GetMapping(value = "/all", produces = "application/json")
	public ResponseEntity<ProductsList> getAllProducts (){
		
		
		return new ResponseEntity<ProductsList>(productService.selAllProducts(),HttpStatus.OK);
		
		
	}
	
	
}
