package com.daniallio.webapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "PRODUCTS")
@Data
public class Products {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID", nullable = false, updatable = false, insertable = false)
	private int id_product; 
	
	@Column(name = "PRO_DESC", nullable = false)
	private String description;
	
	
	@Column(name = "PRO_BARCODE", nullable = false)
	private String barcode;
	
	
	
	
	
	
	
}
