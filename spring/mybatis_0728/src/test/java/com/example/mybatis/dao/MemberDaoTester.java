package com.example.mybatis.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.mybatis.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",  //classpath: �̷��� �Ϸ��� ���ҽ������ؿ� �־����
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})

public class MemberDaoTester {
	@Autowired
	private ApplicationContext ctx;
	
	@Test @Ignore
	public void testInsert() {
		MemberDao dao =ctx.getBean(MemberDao.class);
		try {
			MemberVO member = new MemberVO("abc@abc.com","1234","�׽���",null,null);
			dao.insert(member);
			System.out.println("ȸ������ó���� �Ϸ�Ǿ����ϴ�.");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	@Test @Ignore
	public void testDelete() {
		MemberDao dao =ctx.getBean(MemberDao.class);
		String email= "abc@abc.com";
		try {
			dao.delete(email);
			System.out.println("ȸ��Ż��ó���� �Ϸ�Ǿ����ϴ�.");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
	@Test @Ignore
	public void testUpdate() {
		MemberDao dao =ctx.getBean(MemberDao.class);
		MemberVO member = new MemberVO("abc@abc.com","1234","�׽�����Ʈ",null,null);
		try {
			dao.update(member);
			System.out.println("ȸ����������ó���� �Ϸ�Ǿ����ϴ�.");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
	@Test 
	public void testSelectByEmail() {
		MemberDao dao =ctx.getBean(MemberDao.class);
		try {
			String email="abc@abc.com";
			MemberVO member =dao.selectByEmail(email);
			System.out.println(member);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	

	public void testLogin() {
		MemberDao dao =ctx.getBean(MemberDao.class);
		try {
			String email="abc@abc.com";
			String pass="1234";
			MemberVO member =dao.login(email, pass);
			System.out.println(member);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	@Test @Ignore
	public void testSelectAll() {
		MemberDao dao =ctx.getBean(MemberDao.class);
		try {
			List<MemberVO> members = dao.selectAll();
			for(int i= 0;i <members.size();i++) {
				System.out.println((i+1)+":"+members.get(i));
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
}
