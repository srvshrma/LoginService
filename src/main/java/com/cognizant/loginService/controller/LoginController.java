package com.cognizant.loginService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loginService.model.Login;
import com.cognizant.loginService.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService service;
	
	@PostMapping("/login")
	public Login create(@RequestBody Login login) {
		
		return service.createLogin(login); 
	} 
	
	

}
