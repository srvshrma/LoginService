package com.cognizant.loginService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.loginService.model.Login;
import com.cognizant.loginService.model.UserRole;
import com.cognizant.loginService.repository.LoginRepository;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository repo;
	@Override
	public Login createLogin(Login login) {
		UserRole role = new UserRole();
		role.getRole();
		return repo.save(login);
	}
	@Override
	public Optional<Login> findLoginById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
