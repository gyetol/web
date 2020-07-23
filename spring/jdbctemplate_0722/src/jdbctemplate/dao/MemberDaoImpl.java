package jdbctemplate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jdbctemplate.mapper.MemberVOMapper;
import jdbctemplate.pstmt.SelectByEmailPassPstmtCreator;
import jdbctemplate.vo.MemberVO;

@Repository //@Component�η�
@Qualifier("memberDao") //@Repository("memberDao")��� �ϳ��� �ٿ��� ��
public class MemberDaoImpl implements MemberDao {
	@Autowired //JdbcTemplate Ÿ���� ���� �ڵ����� temp�� ���� �ȴ�(xml���� ������ڴ�~)
	private JdbcTemplate temp;

	@Override
	public void insert(MemberVO member) throws Exception {
		//String sql="insert into members values ('%s','%s','%s',default,default)";
		//sql=String.format(sql, member.getEmail(),member.getPass(),member.getNick());
		//temp.update(sql);
		String sql="insert into members values (?,?,?,default,default)";
		temp.update(sql,member.getEmail(),member.getPass(),member.getNick());
		
	}

	@Override
	public void update(MemberVO member) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String email) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberVO selectByEmail(String email) throws Exception {
		List<MemberVO> members=null;
		String sql = "select * from members where email=?";
		members = temp.query(sql, new MemberVOMapper(),email);

		return (members.size()==0? null: members.get(0));
	}

	@Override
	public MemberVO selectByEmailPass(final String email, final String pass) throws Exception {
		List<MemberVO> members= null;
		members= temp.query(new SelectByEmailPassPstmtCreator(email,pass),new MemberVOMapper());
		return (members.size()==0? null:members.get(0));
	}

	@Override
	public List<MemberVO> selectList(String column, String str) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
