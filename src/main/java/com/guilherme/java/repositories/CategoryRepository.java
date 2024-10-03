package com.guilherme.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.java.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
