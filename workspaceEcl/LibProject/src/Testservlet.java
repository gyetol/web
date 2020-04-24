import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Testservlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		response.setContentType("text/html; charset=utf-8");
		try {
		Class.forName("org.mariadb.jdbc.Driver");
		response.getWriter().println("드라이버 검색 성공");
		}
		catch(ClassNotFoundException e) {
			response.getWriter().println("드라이버 검색 실패");
		}
	}
}
