package com.guilherme.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.java.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
