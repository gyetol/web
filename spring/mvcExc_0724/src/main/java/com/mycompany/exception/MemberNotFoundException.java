package com.mycompany.exception;

public class MemberNotFoundException extends MemberException {
	public static final String MESSAGE="�������� �ʴ� �����ּ��̰ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�";
	
	public MemberNotFoundException() {
		this(MESSAGE);
	}

	public MemberNotFoundException(String message) {
		super(message);
	}
	

}
