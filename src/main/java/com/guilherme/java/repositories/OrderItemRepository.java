package com.guilherme.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.java.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
