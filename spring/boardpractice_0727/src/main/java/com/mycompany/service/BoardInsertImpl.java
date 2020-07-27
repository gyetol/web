package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mycompany.dao.BoardDao;
import com.mycompany.exception.BoardException;
import com.mycompany.vo.BoardVO;

@Service("boardInsert")
public class BoardInsertImpl implements BoardInsert {
	@Autowired
	@Qualifier("boardDao")
	BoardDao dao;

	@Override
	public void execute(BoardVO board) throws BoardException {
		// TODO Auto-generated method stub

	}

}
