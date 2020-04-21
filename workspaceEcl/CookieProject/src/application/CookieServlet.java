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
		//cookie.setDomain("powerlinux.co.kr"); //�����ϸ� powerlinux.co.kr������ ���� �ִ�
		//cookie.setPath("/"); //Ư�� ���丮�������� ��ȿ�ϰ� ���� ���� �ִ�.
		response.addCookie(cookie);
		response.getWriter().println("��Ű�� �����Ͽ����ϴ�.");
	}
}
