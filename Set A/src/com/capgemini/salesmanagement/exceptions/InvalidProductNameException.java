package com.capgemini.salesmanagement.exceptions;

public class InvalidProductNameException extends Exception{

	public InvalidProductNameException() {
		super();
	}

	public InvalidProductNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidProductNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidProductNameException(String message) {
		super(message);
	}

	public InvalidProductNameException(Throwable cause) {
		super(cause);
	}

}
