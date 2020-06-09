package com.dto;

public class LoginStatusTransfer {

	private String fullName;
	private boolean match;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public boolean isMatch() {
		return match;
	}

	public void setMatch(boolean match) {
		this.match = match;
	}

	@Override
	public String toString() {

		return "Full name :" + fullName + "Match :" + match;
	}

}
