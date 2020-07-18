package com.exceptions;

public class StackunderFlowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StackunderFlowException(String errorMessage) {
		super(errorMessage);
	}
	
	public StackunderFlowException(String msg, Throwable err){
		super(msg, err);
	}
}
