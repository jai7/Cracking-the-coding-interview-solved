package com.exceptions;

public class StackOverflowException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StackOverflowException(String errorMessage) {
		super(errorMessage);
	}
	
	public StackOverflowException(String msg, Throwable err){
		super(msg, err);
	}
}
