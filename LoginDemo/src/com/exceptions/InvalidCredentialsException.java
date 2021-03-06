package com.exceptions;

public class InvalidCredentialsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidCredentialsException(String errorMessage) {
		super(errorMessage);
	}

	public String getMessage() {
		return "fault: " + super.getMessage();
	}
}