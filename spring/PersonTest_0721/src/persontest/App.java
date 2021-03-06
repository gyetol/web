package persontest;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("persontest/AppContext.xml");
		
		Person p = ctx.getBean(Person.class);
		p.print();
	}
}
