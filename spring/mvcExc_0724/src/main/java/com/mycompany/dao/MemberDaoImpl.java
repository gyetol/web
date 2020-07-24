package com.mycompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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

}
