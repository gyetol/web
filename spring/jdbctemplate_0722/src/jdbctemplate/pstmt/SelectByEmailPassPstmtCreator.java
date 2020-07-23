package jdbctemplate.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

import jdbctemplate.vo.MemberVO;

public class SelectByEmailPassPstmtCreator implements PreparedStatementCreator {
	private String email;
	private String pass;
	
	public SelectByEmailPassPstmtCreator(String email,String pass) {
		this.email=email;
		this.pass=pass;
	}
	
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		String sql = "select * from members where email=? and pass=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, email);
		pstmt.setString(2, pass);
		
		return pstmt;
	}

}
