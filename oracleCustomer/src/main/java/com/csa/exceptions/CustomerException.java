package com.csa.exceptions;

public class CustomerException {
	private String message;
	private Throwable cause ;
	public CustomerException(String message, Throwable cause) {
		super();
		this.message = message;
		this.cause = cause;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Throwable getCause() {
		return cause;
	}
	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
	

	
}
