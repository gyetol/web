package com.mycompany.exception;

public class BoardInsertException extends BoardException {
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE="게시글 등록에 실패하였습니다";
	public BoardInsertException() {
		this(MESSAGE);
	}
	
	public BoardInsertException(String message) {
		super(message);
	}

}
