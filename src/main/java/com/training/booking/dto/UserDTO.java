package com.training.booking.dto;

import com.training.booking.entities.enums.UserType;

public class UserDTO {
	private String email;
	private String password;
	private UserType userType;

	public String getEmail() {
		return email;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
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