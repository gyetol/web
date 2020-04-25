import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	
	
	public void init(ServletConfig config) throws ServletException{
		ServletContext sc = config.getServletContext();
		String jdbcURL = sc.getInitParameter("jdbcURL");
		String database = sc.getInitParameter("database");
		String dbUser = sc.getInitParameter("dbUser");
		String dbPass = sc.getInitParameter("dbPass");
		StringBuffer sb =new StringBuffer();
		sb.append(jdbcURL).append("/").append(database).append("?")
		.append("user=").append(dbUser).append("&").append("password=").append(dbPass);
		sc.setAttribute("URL", sb.toString());
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
}
}