package com.projpurchase.dto;

public class LoginStatusTransfer {
	private String firstName;
	private boolean match;

	public boolean isMatch() {
		return match;
	}

	public void setMatch(boolean match) {
		this.match = match;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "LoginStatusTransfer firstName=" + firstName + ", match=" + match;
	}
	
	
}
