package keyholder.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

import keyholder.vo.PartVO;

public class PartInsertCreator implements PreparedStatementCreator {
	//private String partName;
	private PartVO part;
	private String[] columns;
	
	public PartInsertCreator(PartVO part,String[] columns) {
		this.part=part;
		this.columns=columns;
	}
	
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

		String sql = "insert into parts(PartName) values(?)";
		PreparedStatement pstmt = con.prepareStatement(sql, columns);
		pstmt.setString(1, part.getPartName());
		return pstmt;

	}

}
