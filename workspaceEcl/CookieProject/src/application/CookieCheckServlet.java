package application;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieCheckServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html; charset=utf-8");
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies) {
			response.getWriter().println(c.getName()+":"+c.getValue());
		}
	}
}
