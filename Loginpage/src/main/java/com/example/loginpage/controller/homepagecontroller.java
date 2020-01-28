package com.example.loginpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.loginpage.service.HomePageServiceInterface;

@Controller
public class homepagecontroller {

	
	@Autowired
	HomePageServiceInterface service;
	
	
	@GetMapping("/home")
	public String loginpage()
	{
		return"login";
	}
	
	@GetMapping("/welcomepage")
	public String secondpage()
	{
		return "welcome";
	}
	
	@GetMapping("/errorpage")
	public String thirdpage() {
		return "auth";
	}
	
	@PostMapping({"/validate"})
	public ModelAndView homepage(@RequestParam(value="username",required = false)String name,@RequestParam(value="password",required = false)String password,Model model) {
		System.out.println("name");
		System.out.println("Password");
		Boolean flag=service.Validateuser(name,password);
		if(flag)
		{
			ModelAndView modelview=new ModelAndView("welcome");
			return modelview;
		}
		ModelAndView modelview1=new ModelAndView("auth");
		return modelview1;
	}
	
	
	
	}
