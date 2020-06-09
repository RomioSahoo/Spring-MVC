package com.pro.model;

public class Member {

	private String fname,lname,mobile,email;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString()
	{
		StringBuilder builder=new StringBuilder();
		builder.append("Member [ ").append("fname = ").append(fname);
		builder.append(", lname= ").append(lname).append(", mobile = ");
		builder.append(mobile).append(", email = ").append(email).append(" ] ");
		return builder.toString();
	}
}
