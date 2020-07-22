package beanTest;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanTest/AppContext.xml");
		//((AbstractApplicationContext)ctx).registerShutdownHook();
		Person p = ctx.getBean("person1",Person.class);
		System.out.println(p);
		
		
//		Set set = (Set)ctx.getBean("set");
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
//		
//		Properties prop=(Properties)ctx.getBean("env");
		//System.out.println(prop.get("name"));
		//System.out.println(prop.get("pi"));
		//System.out.println(prop.get("number"));
		
	}

}
