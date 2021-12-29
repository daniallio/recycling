package com.daniallio.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniallio.webapp.entities.Products;
import com.daniallio.webapp.entities.ProductsList;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer>{

	
	//public ProductsList selAllProductList();
	
	public Products findByBarcode(String barcode);
	
	
	
}
