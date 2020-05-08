package com.cognizant.loginService.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@Table(name = "login")
public class Login {
	@Id
	private int user_id;
	
	private String password;
	
	
	@OneToMany(mappedBy="login",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List<UserRole> userRole;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login() {
		super();
	}
	

}
