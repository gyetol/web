package com.mycompany.exception;

public class MemberNotFoundException extends MemberException {
	public static final String MESSAGE="존재하지 않는 메일주소이거나 비밀번호가 일치하지 않습니다";
	
	public MemberNotFoundException() {
		this(MESSAGE);
	}

	public MemberNotFoundException(String message) {
		super(message);
	}
	

}
