package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ConnectionManager;
@WebServlet("/login")
public class Login extends HttpServlet {

	private static final long serialVersionUID=1L;
	

	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException{
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
	
		PrintWriter out=response.getWriter();
		
	
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt2=null;
		ResultSet rs=null;
		ResultSet rs2=null;
		String email= request.getParameter("email");
		String pass= request.getParameter("pass");
		try {
			conn=ConnectionManager.getconnection();
			pstmt=conn.prepareStatement("select * from members where email='"+email+"'");
			pstmt2=conn.prepareStatement("select * from members where pass='password('"+pass+"')'");
			rs=pstmt.executeQuery();
			rs2=pstmt.executeQuery();
			if(!rs.next()) {
				out.println("{errno:1,message:'없는 계정입니다. 계정이름을 확인하세요'}");
			}
			else {
				rs2.next();
				
				if(rs2.getString("email").equals(rs.getString("email")))
				{
					HttpSession session = request.getSession();
					session.setAttribute("email", email);
					out.println("{errno:0,message:'로그인되었습니다'}");	
				}
				else
				{
					out.println("{errno:2,message:'비밀번호가 일치하지 않습니다'}");
				}
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			ConnectionManager.close(pstmt);
		}
		
	}

}
