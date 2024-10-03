package com.guilherme.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.java.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
