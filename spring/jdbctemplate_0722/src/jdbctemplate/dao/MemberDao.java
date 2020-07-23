package jdbctemplate.dao;

import java.util.List;

import jdbctemplate.vo.MemberVO;

public interface MemberDao {
	void insert(MemberVO member) throws Exception;
	void update(MemberVO member) throws Exception;
	void delete(String email) throws Exception;
	MemberVO selectByEmail(String email) throws Exception; //�̸��� �ߺ�Ȯ���Ҷ� ����
	MemberVO selectByEmailPass(String email,String pass) throws Exception; //�α����Ҷ� ����
	List<MemberVO> selectList(String column,String str) throws Exception;
}
