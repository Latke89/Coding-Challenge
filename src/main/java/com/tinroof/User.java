package com.tinroof;

import javax.persistence.*;

/**
 * Created by Brett on 12/21/16.
 */

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	int userId;

	@Column
	String name;

	@Column
	String email;

	@Column
	String password;


	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public User() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
