package jdbctemplate.dao;

import java.util.List;

import jdbctemplate.vo.MemberVO;

public interface MemberDao {
	void insert(MemberVO member) throws Exception;
	void update(MemberVO member) throws Exception;
	void delete(String email) throws Exception;
	MemberVO selectByEmail(String email) throws Exception; //이메일 중복확인할때 쓰자
	MemberVO selectByEmailPass(String email,String pass) throws Exception; //로그인할때 쓰자
	List<MemberVO> selectList(String column,String str) throws Exception;
}
