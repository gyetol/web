package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ConnectionManager;

@WebServlet("/writeBoard")
public class BoardWrite extends HttpServlet{
	private static final long serialVersionUID=1L;
	
	public String setNumber(String key,Number value) {
	return key+":"+value;
	}
	
	public String setString(String key,String value) {
		return (key+ ":'"+value+"'");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException{
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
	
		PrintWriter out=response.getWriter();
		
		HttpSession session = request.getSession(false);
		if(session == null) {
			StringBuffer sb = new StringBuffer();
			sb.append("{");
			sb.append(setNumber("errno",9));
			sb.append(",");
			sb.append(setString("message","로그인을 하셔야 등록이 가능합니다."));
			sb.append("}");
			out.println(sb);
			return;
		}
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=ConnectionManager.getconnection();
			pstmt=conn.prepareStatement("insert into board values(default,?,?,?,default,default,default,default)");
			pstmt.setString(1,(String)session.getAttribute("email"));
			pstmt.setString(2,request.getParameter("title"));
			pstmt.setString(3,request.getParameter("content"));
			pstmt.executeUpdate();
			out.println("{errno:0,message:'자료등록이 정상적으로 처리 되었습니다.'}");
			
		}
		catch(SQLException e) {
			System.err.println(e.getMessage());
			out.println("{errno:1,message:'자료 등록에 실패하였습니다'}");
		}
		finally {
			ConnectionManager.close(pstmt);
		}
		
	}

}
