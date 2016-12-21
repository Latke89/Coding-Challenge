package com.tinroof;

/**
 * Created by Brett on 12/21/16.
 */
public class LoginInfoPost {

	String email;
	String password;

	public LoginInfoPost(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public LoginInfoPost() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
