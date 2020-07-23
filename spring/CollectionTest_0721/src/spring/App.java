package spring;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/AppContext.xml");
		List<String> list = (List<String>)ctx.getBean("list");
		for(String name: list) {
			System.out.println(name);
		}
		Map map = (Map)ctx.getBean("map");
		
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
	}

}
