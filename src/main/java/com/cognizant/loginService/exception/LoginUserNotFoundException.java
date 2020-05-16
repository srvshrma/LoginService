package com.cognizant.loginService.exception;

@SuppressWarnings("serial")
public class LoginUserNotFoundException extends Exception{
	
	public LoginUserNotFoundException(String message) {
		super(message);
	}

}
