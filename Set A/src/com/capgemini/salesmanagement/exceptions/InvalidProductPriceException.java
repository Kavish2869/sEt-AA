package com.capgemini.salesmanagement.exceptions;

public class InvalidProductPriceException extends Exception{

	public InvalidProductPriceException() {
		super();
	}

	public InvalidProductPriceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidProductPriceException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidProductPriceException(String message) {
		super(message);
	}

	public InvalidProductPriceException(Throwable cause) {
		super(cause);
	}

}
