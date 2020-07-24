package org.example.mvcTest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("org.example.mvcTest") //이 패키지를 감시하라는 의미
public class CommonExceptionController {
	
	@ExceptionHandler(ArithmeticException.class)
	public String handleArithmeticException() {
		return "error";
	}

}
