package org.example.mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
	
	@RequestMapping("/exception")
	public String except(Model model) {
		try {
		int a = 10;
		int b = 0;
		int c = a/b;
		model.addAttribute("value",c);
		}
		catch(ArithmeticException e) {
			return "error";
		}
		return "ok";
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public String doExcept() {
		
		return "error";
	}
}
