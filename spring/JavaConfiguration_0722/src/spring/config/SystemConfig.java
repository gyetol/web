package spring.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {
	
	@Bean
	public Map<String,Integer> map(){
		HashMap<String,Integer> m = new HashMap<>();
		m.put("����",90);
		m.put("����",95);
		m.put("����",96);
		return m;
	}
}
