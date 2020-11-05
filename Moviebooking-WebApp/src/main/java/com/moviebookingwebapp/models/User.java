package com.moviebookingwebapp.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	@NotNull(message = "Email can not be null")
	@Email(message = "Email should be in correct format")
	private String email;
	@NotNull(message = "Password can not be null")
	private String password;
	@NotNull(message = "Mobile number can not be null")
	@Size(min = 10, max = 10)
	private String mobile;
	private String profilePicture;
	@NotNull(message = "First name can not be null")
	private String firstName;
	@NotNull(message = "Last name can not be null")
	private String lastName;
	@NotNull(message = "DOB can not be null")
	private String dob;
	@NotNull(message = "Gender can not be null")
	private String gender;
	@NotNull(message = "Role can not be null")
	private String role;

	public User() {
		super();
	}

	public User(String email, String password, String mobile, String profilePicture, String firstName, String lastName,
			String dob, String gender, String role) {
		super();
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.profilePicture = profilePicture;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.role = role;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getFirstName() {
		return firstName.toLowerCase();
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName.toLowerCase();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
