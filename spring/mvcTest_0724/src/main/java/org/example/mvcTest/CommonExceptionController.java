package org.example.mvcTest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("org.example.mvcTest") //�� ��Ű���� �����϶�� �ǹ�
public class CommonExceptionController {
	
	@ExceptionHandler(ArithmeticException.class)
	public String handleArithmeticException() {
		return "error";
	}

}
