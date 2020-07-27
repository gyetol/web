package com.mycompany.dao;

import com.mycompany.exception.BoardException;
import com.mycompany.vo.BoardVO;

public interface BoardDao {
	void insert(BoardVO board) throws BoardException;
	void update(BoardVO board) throws BoardException;
}
