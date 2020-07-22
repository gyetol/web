package spring.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	public String name() {
		return "ȫ�浿";
	}

	@Bean
	public ArrayList<Integer> list() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10;i++) {
			list.add(i);
		}
		return list;
	}
}
