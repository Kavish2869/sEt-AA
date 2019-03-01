package com.capgemini.salesmanagement.exceptions;

public class InvalidQuantityException extends Exception{

	public InvalidQuantityException() {
		super();
	}

	public InvalidQuantityException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidQuantityException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidQuantityException(String message) {
		super(message);
	}

	public InvalidQuantityException(Throwable cause) {
		super(cause);
	}

}
