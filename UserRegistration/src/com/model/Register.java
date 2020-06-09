package com.model;

public class Register {

	private String fullname;
	private String username;
	private String password;
	private String gender;
	private String email;
	private String dob;

	public Register(String fullname, String username, String password, String gender, String email, String dob) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.email = email;
		this.dob = dob;
	}

	public Register() {

	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Registration details  ").append("fullname = ").append(fullname);
		builder.append(", username = ").append(username);
		builder.append(", password= ").append(password);
		builder.append(", gender= ").append(gender);
		builder.append(", email= ").append(email);
		builder.append(", dob= ").append(dob);

		return builder.toString();
	}

}
