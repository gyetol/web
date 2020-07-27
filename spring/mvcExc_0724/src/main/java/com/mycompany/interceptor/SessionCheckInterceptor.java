package com.mycompany.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class SessionCheckInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handle) {
		HttpSession session = request.getSession(false);
		if(session==null) {
			return false;
		}
		if(session.getAttribute("loginInfo")==null) {
			return false;
		}
			return true;
	}
}
