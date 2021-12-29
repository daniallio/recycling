package com.daniallio.webapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniallio.webapp.entities.Products;
import com.daniallio.webapp.entities.ProductsList;
import com.daniallio.webapp.repository.ProductRepository;



@Service
@Transactional
public class ProductsServiceImp implements ProductsService{

	
	@Autowired
	ProductRepository repo;
	
	
	@Override
	public ProductsList selAllProducts() {
		
		List<Products> list = new ArrayList<Products>();
		list = repo.findAll();
		
		ProductsList productLists = new ProductsList();
		productLists.setProductList(list);
		
		return productLists;
		
	}

	@Override
	public Optional<Products> selById(int id) {
		
		return repo.findById(id);
	}

	
	
	@Override
	public void insProduct(Products product) {	
		repo.save(product);		
	}

	@Override
	public void delProduct(Products product) {		
		repo.delete(product);		
	}

	@Override
	public void updProduct(Products product) {		
		repo.save(product);		
	}

	@Override
	public Products selByBarcode(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
