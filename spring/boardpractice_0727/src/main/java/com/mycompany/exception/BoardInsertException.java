package com.mycompany.exception;

public class BoardInsertException extends BoardException {
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE="�Խñ� ��Ͽ� �����Ͽ����ϴ�";
	public BoardInsertException() {
		this(MESSAGE);
	}
	
	public BoardInsertException(String message) {
		super(message);
	}

}
