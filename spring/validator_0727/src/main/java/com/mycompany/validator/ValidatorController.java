package com.mycompany.validator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.command.MemberCommand;
import com.mycompany.valid.MemberValidator;

@Controller
public class ValidatorController {
	
	@RequestMapping(value="/validator",method=RequestMethod.GET)
	public String getValidator(Model model) {
		//public String validator(Model model) {
		model.addAttribute("info",new MemberCommand());
//	@RequestMapping(value="/validator")
//	public String validator(@ModelAttribute("info") MemberCommand cmd) {
		return "form";
	}
	
	@RequestMapping(value="/validator", method=RequestMethod.POST)
	public String postValidator(@ModelAttribute("info") MemberCommand cmd,Errors errors) {
		new MemberValidator().validate(cmd,errors);
		if(errors.hasErrors()) {
			return "form";
		}
		else {
			//to do : 서비스 등록
			return "result";
		}
	}

}
