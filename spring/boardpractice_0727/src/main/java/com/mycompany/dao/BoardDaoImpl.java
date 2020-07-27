package com.mycompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.exception.BoardException;
import com.mycompany.exception.BoardInsertException;
import com.mycompany.vo.BoardVO;

@Repository("BoardDao")
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private JdbcTemplate jTemp;

	@Override
	public void insert(BoardVO board) throws BoardException {
		String sql="insert into boards values(default,default,default,?,?,?,default,default)";
		int result=0;
		try {
			result=jTemp.update(sql,board.getEmail(),board.getTitle(),board.getContent());
		}
		catch(Exception e) {
			throw new BoardInsertException();
		}
		if(result==0) {
			throw new BoardInsertException();
		}
	}

	@Override
	public void update(BoardVO board) throws BoardException {
		// TODO Auto-generated method stub

	}

}
