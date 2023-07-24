package com.main.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
	super("User Not Found");	
	}

public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
	
}
