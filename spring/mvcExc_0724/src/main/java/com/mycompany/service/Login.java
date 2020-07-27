package com.mycompany.service;

import javax.servlet.http.HttpSession;

import com.mycompany.exception.MemberException;

public interface Login {
	void execute(HttpSession session,String email,String pass) throws MemberException;
}
