package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Manager;

@Configuration
public class AppConfig {
	
	@Bean
	public Manager manager() {
		Manager manager = new ManagerImpl();
		manager.addEmployee(new Regular("ȫ�浿",30000000));
		return manager;
	}
}
