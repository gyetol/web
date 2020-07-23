package jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdbctemplate.dao.MemberDao;
import jdbctemplate.vo.MemberVO;

@Service("memberRegister") //����Ͻ������� ���� �Ϳ� ����. //@Component�η� //��·�� ���� ����� ��
public class MemberRegisterImpl implements MemberRegister {
	@Autowired
	private MemberDao dao;
	
	@Override
	public void execute(String email,String pass, String pass2, String nick) throws Exception {
		MemberVO member = new MemberVO(email,pass,nick,null,null);
		try {
		dao.insert(member);
		System.out.println("ȸ������ó���� �Ϸ�Ǿ����ϴ�.");
		}
		catch(Exception e) {
			System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
			throw e;
		}
	}

}
