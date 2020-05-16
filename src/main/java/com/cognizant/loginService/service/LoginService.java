package com.cognizant.loginService.service;

import java.util.Optional;

import com.cognizant.loginService.model.Login;

public interface LoginService {

	Login createLogin(Login login);
	
	Optional<Login> findLoginById(int id);
	
	
}
