package com.example.loginpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.entity.loginpageentity;

@Repository
public interface loginpagerepository extends JpaRepository<loginpageentity, Integer>{

	loginpageentity findByusername(String username);
	
}
