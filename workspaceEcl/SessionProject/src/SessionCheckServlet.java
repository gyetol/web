import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sessionCheck")
public class SessionCheckServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)  throws ServletException,IOException {
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out =response.getWriter();
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta charset='utf-8'>");
//		out.println("<title>세션 체크</title>");
//		out.println("</head>");
//		out.println("<body>"
//				+"<p align=center style='background-color:red'>");
//		out.println(request.getSession(false).getAttribute("userId"));
//		out.println("</p></body>");
//		out.println("</html>");
		
		request.getRequestDispatcher("/test.jsp").forward(request, response);
		
	}
}
