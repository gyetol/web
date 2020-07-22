package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(spring.config.AppConfig.class);
		ctx.refresh();
		((AbstractApplicationContext)ctx).registerShutdownHook(); //registerShutdownHook�� �������ؼ��� (AbstractApplicationContext)���� �ö󰡾���
		
		Manager manager = ctx.getBean(Manager.class);
		manager.pay();
		ctx.close();
	}

}
