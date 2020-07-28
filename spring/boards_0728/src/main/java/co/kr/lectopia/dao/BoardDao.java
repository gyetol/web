package co.kr.lectopia.dao;

import java.util.List;

import co.kr.lectopia.vo.BoardVO;

public interface BoardDao {
	List<BoardVO> selectList() throws Exception;
	BoardVO selectById(int id) throws Exception;
	void insert(BoardVO board) throws Exception;
	void update(BoardVO board) throws Exception;
	void delete(int id) throws Exception;
	int getNextMainId() throws Exception;
	int getNextSubId(int mainId) throws Exception;
}
