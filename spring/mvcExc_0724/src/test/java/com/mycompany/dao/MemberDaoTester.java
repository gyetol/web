package com.mycompany.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.exception.MemberException;
import com.mycompany.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class MemberDaoTester {
	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void testInsert() {
		MemberDao dao = ctx.getBean(MemberDao.class);
		MemberVO member = new MemberVO();
		member.setEmail("sim@naver.com");
		member.setPass("1234");
		member.setNick("��û");
		try {
		dao.insert(member);
		System.out.println("ȸ������ó���Ϸ�");
		}
		catch(MemberException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test @Ignore
	public void testLogin() {
		MemberDao dao = ctx.getBean("memberDao",MemberDao.class);
		try {
		MemberVO member = dao.login("hong@naver.com","1234");
		System.out.println("ȸ������ ��濡 �����Ͽ����ϴ�.");
		}
		catch(MemberException e) {
			System.out.println(e.getMessage());
		}
	}
}
