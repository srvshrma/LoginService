package com.cognizant.loginService.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.loginService.model.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, ArrayList<UserRole>> {

}
