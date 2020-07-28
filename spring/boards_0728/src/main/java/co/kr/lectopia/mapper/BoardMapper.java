package co.kr.lectopia.mapper;

import java.util.List;

import co.kr.lectopia.vo.BoardVO;
import co.kr.lectopia.vo.SearchVO;

public interface BoardMapper {
	List<BoardVO> select();
	BoardVO selectById(int id);
	void insert(BoardVO board);
	void update(BoardVO board);
	void delete(int id);
	int nextMainId();
	int nextSubId(int mainId);
	List<BoardVO> searchBySubject(SearchVO search);
	
}
