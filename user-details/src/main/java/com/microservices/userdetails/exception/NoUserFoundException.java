package com.microservices.userdetails.exception;

public class NoUserFoundException extends RuntimeException{
	
	public NoUserFoundException(String msg) {
		super(msg);
	}
}
