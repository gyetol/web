package com.mycompany.service;

import com.mycompany.exception.BoardException;
import com.mycompany.vo.BoardVO;

public interface BoardInsert {
	void execute(BoardVO board) throws BoardException;
}
