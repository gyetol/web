package com.mycompany.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.exception.MemberException;
import com.mycompany.exception.MemberInsertFailedException;
import com.mycompany.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private JdbcTemplate jTemp;
	@Override
	public void insert(MemberVO member) throws MemberException {
		String sql="insert into members values (?,?,?,default,default)";
		int result=0;
		try {
		result=jTemp.update(sql,member.getEmail(),member.getPass(),member.getNick());
		}
		catch(Exception e) {
			throw new MemberInsertFailedException();
		}
		if(result==0) {
			throw new MemberInsertFailedException();
		}
	}
	
	@Override
	public MemberVO login(String email,String pass) throws MemberException{
		String sql = "select * from members where email=? and pass=?";
		List<MemberVO> members = jTemp.query(sql,new RowMapper<MemberVO>() {

			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemberVO member = new MemberVO();
				member.setEmail(rs.getString("email"));
				member.setPass(rs.getString("pass"));
				member.setNick(rs.getString("nick"));
				member.setRegisteredAt(rs.getTimestamp("registeredAt"));
				member.setRemovedAt(rs.getTimestamp("removedAt"));
				return member;
			}
			
		},email,pass);
		return (members.size()>0?members.get(0):null);
	}

}
