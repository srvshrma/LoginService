package com.cognizant.loginService.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class UserRole {
	@Id
	private int user_id;
	
	private String role;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
@JoinColumn(name="login_user_id")
private Login login;
	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public UserRole() {
		super();
	}
	
	
}
