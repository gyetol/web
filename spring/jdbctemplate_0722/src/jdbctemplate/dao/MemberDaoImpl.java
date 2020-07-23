package jdbctemplate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jdbctemplate.mapper.MemberVOMapper;
import jdbctemplate.pstmt.SelectByEmailPassPstmtCreator;
import jdbctemplate.vo.MemberVO;

@Repository //@Component부류
@Qualifier("memberDao") //@Repository("memberDao")라고 하나로 줄여도 됨
public class MemberDaoImpl implements MemberDao {
	@Autowired //JdbcTemplate 타입의 빈이 자동으로 temp에 들어가게 된다(xml에서 만들었자누~)
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
