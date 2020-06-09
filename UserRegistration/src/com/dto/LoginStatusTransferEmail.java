package com.dto;

public class LoginStatusTransferEmail {

	private String password;
	boolean Ematch;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEmatch() {
		return Ematch;
	}

	public void setEmatch(boolean ematch) {
		Ematch = ematch;
	}

	@Override
	public String toString() {
		return "LoginStatusTransferEmail password=" + password + ", Ematch=" + Ematch;
	}

}
