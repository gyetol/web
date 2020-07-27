/*
 * package com.mycompany.service;
 * 
 * import org.junit.Ignore; import org.junit.Test; import
 * org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 * 
 * import com.mycompany.dao.MemberDao; import
 * com.mycompany.exception.MemberException; import com.mycompany.vo.MemberVO;
 * 
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ContextConfiguration(locations= {
 * "file:src/main/webapp/WEB-INF/spring/root-context.xml",
 * "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
 * 
 * public class LoginTester {
 * 
 * @Autowired private ApplicationContext ctx;
 * 
 * @Test public void testExecute() { Login service =
 * ctx.getBean("login",Login.class);
 * 
 * try { service.execute("hong@naver.com", "1234"); System.out.println("로그인성공");
 * } catch(MemberException e) { System.out.println("로그인 실패"); } } }
 */