package com.tinroof;

/**
 * Created by Brett on 12/21/16.
 */
public class UserContainer {

	User user;
	String errorMessage;

	public UserContainer() {
	}

	public UserContainer(User user, String errorMessage) {
		this.user = user;
		this.errorMessage = errorMessage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
