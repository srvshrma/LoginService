package com.cognizant.loginService.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.loginService.model.Login;

public interface JwtRepository extends CrudRepository<Login, Integer> {
	
	

}
