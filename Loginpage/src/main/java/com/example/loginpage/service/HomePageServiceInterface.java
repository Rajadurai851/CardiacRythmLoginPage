package com.example.loginpage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginpage.entity.loginpageentity;
import com.example.loginpage.repository.loginpagerepository;


@Service
public class HomePageServiceInterface {

	@Autowired
	loginpagerepository repo;
	
	
	public Boolean Validateuser(String username,String password)
	{
		loginpageentity result=repo.findByusername(username);
		if(Optional.ofNullable(result).isPresent()&&result.getPassword().compareTo(password)==0)
		{
			return true;
		}
		return false;
	}
	
}
