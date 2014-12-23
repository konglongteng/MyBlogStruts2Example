package com.myeclipseide.example.myblog.secure;

import com.opensymphony.xwork2.ActionSupport;

public class AuthenticateUser extends ActionSupport {

	private String userName;

	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		// Empty username or password value is not permitted. 
		if (getUserName().equals("") || getPassword().equals("")) {
			addActionError("Invalid username or password. Please try again!");
			return ERROR;
		}
		return SUCCESS;
	}
}