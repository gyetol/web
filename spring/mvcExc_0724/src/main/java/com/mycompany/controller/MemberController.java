package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.command.MemberCommand;
import com.mycompany.exception.MemberException;
import com.mycompany.service.MemberInsert;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	@Qualifier("memberInsert")
	MemberInsert service;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register() {
		return "member/registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute("info") MemberCommand member,Model model) {
		if(member.getEmail().trim().equals("")) {
			model.addAttribute("errorMessage","�����ּҰ� �Էµ��� �ʾҽ��ϴ�.");
			return "member/registerForm";
		}
		
		if(member.getPass().trim().equals("")) {
			model.addAttribute("errorMessage","��й�ȣ�� �Էµ��� �ʾҽ��ϴ�.");
			return "member/registerForm";
		}
		
		if(!member.getPass().equals(member.getPassConfirm())) {
			model.addAttribute("errorMessage","��й�ȣ�� ��й�ȣȮ���� ��ġ���� �ʽ��ϴ�.");
			return "member/registerForm";
		}
		
		if(member.getNick().trim().equals("")) {
			model.addAttribute("errorMessage","ȸ���̸��� �Էµ��� �ʾҽ��ϴ�.");
			return "member/registerForm";
		}
		
		service.execute(member);
		return "member/result";
	}
	
	@ExceptionHandler(MemberException.class)
	public String handleException() {
		return "member/error";
	}
}
