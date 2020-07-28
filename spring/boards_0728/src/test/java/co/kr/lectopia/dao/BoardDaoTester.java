package co.kr.lectopia.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.kr.lectopia.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class BoardDaoTester {
	@Autowired
	private ApplicationContext ctx;
	
	@Test @Ignore
	public void select() {
		BoardDao dao = ctx.getBean(BoardDao.class);
		try {
			List<BoardVO> boards =dao.selectList();
			for(int i =0 ;i<boards.size();i++) {
				BoardVO board=boards.get(i);
				System.out.println(board.getMainId()+":"+board.getSubId()+":"+board.getSubject());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test @Ignore
	public void testReplyInsert() {
		BoardDao dao = ctx.getBean(BoardDao.class);
		BoardVO board = new BoardVO();
		board.setEmail("lee@daum.net");
		board.setSubject("����׽�Ʈ");
		board.setContent("����׽�Ʈ�Դϴ�");
		board.setMainId(1);
		
		try {
			int subId = dao.getNextSubId(board.getMainId());
			board.setSubId(subId);
			dao.insert(board);
			System.out.println("����� ��ϵǾ����ϴ�.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test @Ignore
	public void testInsert() {
		BoardDao dao = ctx.getBean(BoardDao.class);
		BoardVO board = new BoardVO();
		board.setEmail("lee@daum.net");
		board.setSubject("�Է��׽�Ʈ");
		board.setContent("�Է��׽�Ʈ�Դϴ�");
		
		try {
			int mainId = dao.getNextMainId();
			board.setMainId(mainId);
			dao.insert(board);
			System.out.println("�Խù��� ��ϵǾ����ϴ�.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testGetNextMainId() {
		BoardDao dao = ctx.getBean(BoardDao.class);
		try {
			int nextMainId = dao.getNextMainId();
			System.out.println("���� �ֱ۹�ȣ�� "+nextMainId+"���Դϴ�.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
