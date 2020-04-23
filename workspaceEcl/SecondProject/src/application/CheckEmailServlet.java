package application;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/checkEmail")
public class CheckEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public CheckEmailServlet() {
        super();
     
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/plain; charset=utf-8");
		String email=request.getParameter("email");
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		PrintWriter out =null;
		
		try {
			out=response.getWriter();
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/servlet","servlet","1234");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from members where email='"+email+"'");
			if(rs.next()) {
				out.println("{errno:1,message:'이미 등록된 전자메일 주소입니다'}");
			}
			else {
				out.println("{errno:0, message:'사용가능한 전자메일 주소입니다'}");
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			out.println("{errno:2,message:'JDBC 드라이버가 설치되지 않았습니다'}");
		}
		catch(SQLException e) {
			e.printStackTrace();
			out.println("{errno:3,message:'SQL 오류가 발생되었습니다'}");
		}
		catch(Exception e) {
			e.printStackTrace();
			out.println("{errno:4, message:'예상치 못한 오류가 발생하였습니다'}");
		}
		finally {
			try {rs.close();}catch(Exception e) {}
			try {stmt.close();}catch(Exception e) {}
			try {con.close();}catch(Exception e) {}
		}
	}

}
