package com.github.javafaker.pharma;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String userhandle;
	private String password;
	private String role;

	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, String userhandle, String password, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userhandle = userhandle;
		this.password = password;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserhandle() {
		return userhandle;
	}

	public void setUserhandle(String userhandle) {
		this.userhandle = userhandle;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
