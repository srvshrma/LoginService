package com.cognizant.loginService.exception;

public enum ExceptionMessage {
	
	EMPTY("User Not Found with id: "), 
	DUPLICATE("err"), 
	DATABASE("Try after some time"), 
	NOTEMPTY("* feild cannot be empty "), 
	Login_UserName_Not_Found("UserName Not Found of street user: "), 
	Login_Password_Not_Found("Password Not Found with user: "),
	Login_UserRole_Not_Found("UserRole Not Found with user: "),
	NO_RECORD("No record found by id: ");
	private final String message;
	ExceptionMessage(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return this.message;
	}

}
