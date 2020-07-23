package jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdbctemplate.dao.MemberDao;
import jdbctemplate.vo.MemberVO;

@Service("selectByEmailPass")
public class SelectByEmailPassImpl implements SelectByEmailPass {
	@Autowired
	private MemberDao dao;
	
	@Override
	public void execute(String email, String pass) throws Exception {
		MemberVO member = null;
		try {
			member = dao.selectByEmailPass(email,pass);
			if(member==null) { //회원이 없어도 null로 반환이 된다
				System.out.println("회원이 존재하지 않습니다");
				return;
			}
			System.out.println(member);
		}
		catch(Exception e) { //회원이 없는 경우가 아니라, dao를 수행하는 와중에 exception이 터진것이다.
			System.out.println("오류가 발생하였습니다");
			throw e;
		}
	}

}
