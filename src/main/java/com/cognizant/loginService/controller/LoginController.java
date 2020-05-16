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
/*	@GetMapping("/login/id/{1}")
	public Optional<Login> findLogin(@PathVariable(value = "id")int id){
		Login login = new Login();
		LoginDto ldto=new LoginDto(login.getUserName(),login.getPassword());
		Login clogin=service.findLoginById(impl.loginDtoToLogin(ldto));
		
		
		return service.findLoginById(id);
	}*/
	
}
