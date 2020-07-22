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
		m.put("국어",90);
		m.put("영어",95);
		m.put("수학",96);
		return m;
	}
}
