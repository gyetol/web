package jdbctemplate.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.RowMapper;

import jdbctemplate.vo.MemberVO;

public class MemberVOMapper implements RowMapper<MemberVO> {

	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {

		String email = rs.getString("email");
		String pass = rs.getString("pass");
		String nick = rs.getString("nick");
		Timestamp registeredAt = rs.getTimestamp("registeredAt");
		Timestamp removedAt = rs.getTimestamp("removedAt");

		return new MemberVO(email, pass, nick, registeredAt, removedAt);
	}

}
