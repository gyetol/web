package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(spring.config.AppConfig.class);
		ctx.refresh();
		((AbstractApplicationContext)ctx).registerShutdownHook(); //registerShutdownHook을 쓰기위해서는 (AbstractApplicationContext)까지 올라가야함
		
		Manager manager = ctx.getBean(Manager.class);
		manager.pay();
		ctx.close();
	}

}
