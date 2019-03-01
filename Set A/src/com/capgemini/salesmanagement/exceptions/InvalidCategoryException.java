package com.capgemini.salesmanagement.exceptions;

public class InvalidCategoryException extends Exception {

	public InvalidCategoryException() {
		super();
	}

	public InvalidCategoryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidCategoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidCategoryException(String message) {
		super(message);
	}

	public InvalidCategoryException(Throwable cause) {
		super(cause);
	}

}
