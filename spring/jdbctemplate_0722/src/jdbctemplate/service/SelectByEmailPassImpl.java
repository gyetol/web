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
			if(member==null) { //ȸ���� ��� null�� ��ȯ�� �ȴ�
				System.out.println("ȸ���� �������� �ʽ��ϴ�");
				return;
			}
			System.out.println(member);
		}
		catch(Exception e) { //ȸ���� ���� ��찡 �ƴ϶�, dao�� �����ϴ� ���߿� exception�� �������̴�.
			System.out.println("������ �߻��Ͽ����ϴ�");
			throw e;
		}
	}

}
