package com.training.booking.models;

public class UserDTO {
	private String email;
	private String password;

	public UserDTO() {
		super();
	}

	public UserDTO(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
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