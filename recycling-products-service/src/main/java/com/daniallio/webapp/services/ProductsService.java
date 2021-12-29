package com.daniallio.webapp.services;


import java.util.Optional;

import com.daniallio.webapp.entities.Products;
import com.daniallio.webapp.entities.ProductsList;



public interface ProductsService {

	
	public ProductsList selAllProducts();	
	
	public Optional<Products> selById(int id);
	
	public Products selByBarcode(String barcode);
	
	public void insProduct(Products product);
	
	public void delProduct (Products product);
	
	public void updProduct (Products product);
	
	
	
	
}
