package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("AppContext.xml");
		Test test = ctx.getBean("proxy",Test.class);
		test.print();
		int tot=test.tot();
		double avg= test.avg();
		
		
	}

}
