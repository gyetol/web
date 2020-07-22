package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc.dao.PartDAO;
import jdbc.vo.PartVO;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");
		PartDAO dao = ctx.getBean(PartDAO.class);
		List<PartVO> list = dao.selectAll();
		for(PartVO part : list) {
			System.out.println(part);
		}
		
	}
}
