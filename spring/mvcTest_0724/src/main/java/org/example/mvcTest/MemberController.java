package org.example.mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register() {
		return "member/registerForm";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute("user") Member member) {
						
		//model.addAttribute(member);
		
		return "member/result";
		
	}
}
