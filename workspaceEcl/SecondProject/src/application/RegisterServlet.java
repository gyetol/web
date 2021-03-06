package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RegisterServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Connection con =null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/servlet?user=servlet&password=1234");
			pstmt=con.prepareStatement("insert into members (email,nick,pass) values (?,?,password(?))");
			pstmt.setString(1, request.getParameter("email"));
			pstmt.setString(2, request.getParameter("nick"));
			pstmt.setString(3, request.getParameter("pass"));
			if(pstmt.executeUpdate()==0) {
				throw new Exception("사용자 등록 처리에 실패하였습니다.");
			}
			RequestDispatcher disp=request.getRequestDispatcher("/success.html");
			disp.forward(request, response);
					
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			request.getRequestDispatcher("/driver_error.html").forward(request, response);
		}
		catch(SQLException e) {
			e.printStackTrace();
			RequestDispatcher disp= request.getRequestDispatcher("/sql_error.html");
			disp.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
			RequestDispatcher disp=request.getRequestDispatcher("/error.html");
			disp.forward(request,response);
		}
		finally {
			try {pstmt.close();}catch(Exception e) {}
			try {con.close();}catch(Exception e) {}
		}
	}


}
