package spring.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import spring.User;

@Configuration
public class JavaConfig {
	
	@Bean
	public ArrayList<String> list(){
		ArrayList<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("��û��");
		return list;
	}
	
//	@Bean
//	public User user() {
//		User user = new User();
//		user.setUsers(list());
//		return user;
//	}
}
