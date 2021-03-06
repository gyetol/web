package co.kr.lectopia.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kr.lectopia.mapper.BoardMapper;
import co.kr.lectopia.vo.BoardVO;


@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	private BoardMapper mapper;

	@Override
	public List<BoardVO> selectList() throws Exception {
		return mapper.select();
	}

	@Override
	public BoardVO selectById(int id) throws Exception {
		return mapper.selectById(id);
	}

	@Override
	public void insert(BoardVO board) throws Exception {
		mapper.insert(board);
	}

	@Override
	public void update(BoardVO board) throws Exception {
		mapper.update(board);
	}

	@Override
	public void delete(int id) throws Exception {
		mapper.delete(id);
	}

	@Override
	public int getNextMainId() throws Exception {
		return mapper.nextMainId();
	}

	@Override
	public int getNextSubId(int mainId) throws Exception {
		return mapper.nextSubId(mainId);
	}

}
