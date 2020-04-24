package kr.co.powerlinux;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		PrintWriter out =response.getWriter();
		
		out.println("<!DOCType html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'/>");
		out.println("<title>ThirdServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>이름:"+name+"</div>");
		out.println("<div>연령:"+age+"</div>");
		out.println("</body>");		
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		PrintWriter out =response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'/>");
		out.println("<title>ThirdServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>이름:"+name+"</div>");
		out.println("<div>연령:"+age+"</div>");
		out.println("</body>");		
		out.println("</html>");
	}

}
