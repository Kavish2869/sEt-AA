package com.capgemini.salesmanagement.exceptions;

public class InvalidProductCodeException extends Exception {

	public InvalidProductCodeException() {
		super();
	}

	public InvalidProductCodeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidProductCodeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidProductCodeException(String message) {
		super(message);
	}

	public InvalidProductCodeException(Throwable cause) {
		super(cause);
	}

}
