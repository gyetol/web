package com.mycompany.exception;

public class MemberInsertFailedException extends MemberException {
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE = "ȸ����Ͽ� �����Ͽ����ϴ�.";
	
	public MemberInsertFailedException() {
		this(MESSAGE);
	}
	public MemberInsertFailedException(String message) {
		super(message);
	}
}
