package com.guilherme.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.java.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
