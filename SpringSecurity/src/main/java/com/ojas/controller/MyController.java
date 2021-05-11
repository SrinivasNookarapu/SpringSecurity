package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.User;
import com.ojas.service.MyUserDetailsService;

@Controller
public class MyController {
	
	@Autowired
	private MyUserDetailsService service;
	
	@RequestMapping("/")
	public String home() {
		return "Home";
	}
	
	@RequestMapping("addAdminDetails")
	public String addUser(User user) {
		service.addUser(user);
		return "Added";
		
	}

}
