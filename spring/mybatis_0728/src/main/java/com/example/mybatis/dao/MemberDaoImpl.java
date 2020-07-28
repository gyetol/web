package com.example.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mybatis.mapper.MemberMapper;
import com.example.mybatis.vo.MemberVO;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	/*@Autowired
	private JdbcTemplate jTemp;*/
	@Autowired
	private SqlSession session;
	@Autowired
	private MemberMapper mapper;
	
	
	@Override
	public void insert(MemberVO member) throws Exception {
		mapper.insert(member);
		
		//session.insert("myNS.insert",member);
		
		/*String sql = "insert into members values (?,password(?),?,default,default)";
		int result = jTemp.update(sql,member.getEmail(),member.getPass(),member.getNick());
		if(result==0) {
			throw new Exception("회원등록에 실패하였습니다.");
		}*/
	}

	@Override
	public void delete(String email) throws Exception {
		mapper.delete(email);
		
		
		//session.update("myNS.delete",email);
		
		/*String sql = "update members set removedAt = current_timestamp where email=?";
		int result= jTemp.update(sql,email);
		if(result ==0 ) {
			throw new Exception("회원탈퇴처리에 실패하였습니다");
		}*/
	}

	@Override
	public void update(MemberVO member) throws Exception {
		mapper.upate(member);
		
		//session.update("myNS.update",member);
		
		
		/*String sql = "update members set pass = password(?), nick=? where email=?";
		int result = jTemp.update(sql,member.getPass(),member.getNick(),member.getEmail());
		if(result==0) {
			throw new Exception("회원정보변경에 실패하였습니다.");
		}*/
		
	}

	@Override
	public MemberVO selectByEmail(String email) throws Exception {
		return mapper.selectByEmail(email);
		
		//return session.selectOne("myNS.selectByEmail",email);
		
		/*String sql = "select * from members where email=?";
		List<MemberVO> members = jTemp.query(sql,new RowMapper<MemberVO>() {

			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				String email= rs.getString("email");
				String pass = rs.getString("pass");
				String nick = rs.getString("nick");
				Timestamp registeredAt = rs.getTimestamp("registeredAt");
				Timestamp removedAt =rs.getTimestamp("removedAt");
				return new MemberVO(email,pass,nick,registeredAt,removedAt);
			}
		},email);
		return (members.size()==0? null:members.get(0));*/
	}

	@Override
	public MemberVO login(String email, String pass) throws Exception {
		MemberVO member = new MemberVO();
		member.setEmail(email);
		member.setPass(pass);
		return mapper.login(member);
		
		//return session.selectOne("myNS.login",member);
		
		
		/*String sql = "select * from members where email=? and pass=?";
		List<MemberVO> members = jTemp.query(sql,new RowMapper<MemberVO>() {

			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				String email= rs.getString("email");
				String pass = rs.getString("pass");
				String nick = rs.getString("nick");
				Timestamp registeredAt = rs.getTimestamp("registeredAt");
				Timestamp removedAt =rs.getTimestamp("removedAt");
				return new MemberVO(email,pass,nick,registeredAt,removedAt);
			}
		},email,pass);
		return (members.size()==0? null:members.get(0));*/
	}

	@Override
	public List<MemberVO> selectAll() throws Exception {
		return mapper.selectAll();
		
		//return session.selectList("myNS.selectAll");
		
		
		/*String sql = "select * from members order by email";
		List<MemberVO> members = jTemp.query(sql,new RowMapper<MemberVO>() {

			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				String email= rs.getString("email");
				String pass = rs.getString("pass");
				String nick = rs.getString("nick");
				Timestamp registeredAt = rs.getTimestamp("registeredAt");
				Timestamp removedAt =rs.getTimestamp("removedAt");
				return new MemberVO(email,pass,nick,registeredAt,removedAt);
			}
		});
		return members;*/
	}

}
