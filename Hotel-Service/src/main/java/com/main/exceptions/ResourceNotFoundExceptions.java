package com.main.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException {
	
	
	public ResourceNotFoundExceptions() {
		super("hotel not found on server");
	}

	public ResourceNotFoundExceptions(String msg)
	{
		super(msg);
	}
	
}
