package com.mycompany.exception;

public abstract class BoardException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public BoardException(String message) {
		super(message);
	}
}
