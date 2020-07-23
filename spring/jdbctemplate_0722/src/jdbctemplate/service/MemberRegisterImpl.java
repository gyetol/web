package jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdbctemplate.dao.MemberDao;
import jdbctemplate.vo.MemberVO;

@Service("memberRegister") //비즈니스로직을 가진 것에 쓴다. //@Component부류 //어쨌든 빈을 만드는 것
public class MemberRegisterImpl implements MemberRegister {
	@Autowired
	private MemberDao dao;
	
	@Override
	public void execute(String email,String pass, String pass2, String nick) throws Exception {
		MemberVO member = new MemberVO(email,pass,nick,null,null);
		try {
		dao.insert(member);
		System.out.println("회원가입처리가 완료되었습니다.");
		}
		catch(Exception e) {
			System.out.println("회원가입에 실패하였습니다.");
			throw e;
		}
	}

}
