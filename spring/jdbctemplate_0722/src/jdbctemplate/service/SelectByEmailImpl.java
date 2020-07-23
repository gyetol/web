package jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdbctemplate.dao.MemberDao;
import jdbctemplate.vo.MemberVO;

@Service("selectByEmail")
public class SelectByEmailImpl implements SelectByEmail {
	@Autowired
	private MemberDao dao;
	
	@Override
	public void execute(String email) throws Exception {
		MemberVO member = null;
		try {
			member = dao.selectByEmail(email);
			System.out.println(member);
		}
		catch(Exception e) {
			System.out.println("해당 메일주소는 존재하지 않습니다.");
			throw e;
		}
	}

}
