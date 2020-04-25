import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/session")
public class SessionServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		req.setCharacterEncoding("UTF-8");
		
		HttpSession session =req.getSession();
		session.setAttribute("userId", req.getParameter("userId"));
		req.setAttribute("name", "kimseokjung");
		System.out.println("세션객체에 속성을 추가하였습니다.");
		req.getRequestDispatcher("/test.jsp").forward(req,res);
	}
}
