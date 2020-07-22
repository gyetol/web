package spring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(spring.config.AppConfig.class);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(spring.config.AppConfig.class);
		ctx.register(spring.config.SystemConfig.class);
		ctx.refresh(); //register를 했다면 refresh를 반드시 해주어야 한다.
		
		String n = ctx.getBean(String.class);
		String m = (String)ctx.getBean("name");
		System.out.println(n);
		System.out.println(m);
		System.out.println(m==n);
		
		ArrayList<Integer> l = (ArrayList<Integer>)ctx.getBean("list");
		System.out.println(l);
		
		Map<String,Integer> j = ctx.getBean("map",Map.class);
		Set<String> keySet = j.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			System.out.printf("%s : %d\n",key,j.get(key));
		}
		
		ctx.close(); //빈객체들이 함께 소멸된다
	}
}
