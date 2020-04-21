package application;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=utf-8");
		Cookie cookie= new Cookie("name",request.getParameter("name"));
		cookie.setMaxAge(1*24*60*60);
		//cookie.setDomain("powerlinux.co.kr"); //지정하면 powerlinux.co.kr에서만 쓸수 있다
		//cookie.setPath("/"); //특정 디렉토리내에서만 유효하게 만들 수도 있다.
		response.addCookie(cookie);
		response.getWriter().println("쿠키를 저장하였습니다.");
	}
}
