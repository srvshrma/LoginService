package com.cognizant.loginService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.loginService.model.Login;
@Repository
public interface LoginRepository extends CrudRepository<Login, Integer>{

}
