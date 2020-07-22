package spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/spring/config/SpringConfig.xml");
		User user = ctx.getBean(User.class);
		user.print();
		user.scorePrint();
		
	}
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(spring.config.JavaConfig.class);
		User user = ctx.getBean(User.class);
		user.print();
		user.scorePrint();
	}*/
	
	
	
	/*
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/config/SpringConfig.xml");
		HashMap map = ctx.getBean(HashMap.class);
		Set keySet = map.keySet();
		Iterator keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			Object key = keyIter.next();
			System.out.println(key+":"+map.get(key));
		}
		
		ArrayList<String> list = ctx.getBean(ArrayList.class);
		for(String name : list) {
			System.out.println(name);
		}
	}*/
	
	
}
