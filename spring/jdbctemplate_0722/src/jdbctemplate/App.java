package jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbctemplate.service.SelectByEmailPass;

public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");
		//MemberRegister service = ctx.getBean(MemberRegister.class);
		//service.execute("cupid072@naver.com","1234","1234","°­»ç´Ô");
		SelectByEmailPass service = ctx.getBean(SelectByEmailPass.class);
		service.execute("cupid072@naver.com","1234");
	}
}
