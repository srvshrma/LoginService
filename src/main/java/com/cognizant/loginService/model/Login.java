package com.cognizant.loginService.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;


@Entity

@Table(name = "login")
public class Login {
	@Id
	private int user_id;
	private String userName;
	private String password;
	
	
	@OneToMany(mappedBy="login",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	@Column(name = "user_role")
	
	private List<UserRole> userRole;

	


	public Login(int user_id, String userName, String password, List<UserRole> userRole) {
		super();
		this.user_id = user_id;
		this.userName = userName;
		this.password = password;
		this.userRole = userRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}

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
