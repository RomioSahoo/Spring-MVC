package com.pro.model;

public class InvalidMobileNumberException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public InvalidMobileNumberException(final String message)
	{
		super(message);
	}
	public String getMessage()
	{
		return "fault: "+super.getMessage();
	}
}
