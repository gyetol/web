package beanTest;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person{
	private String name;
	private int age;
	
	
	public Person() {}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return String.format("이름: %s, 연령: %d세", name,age);
	}


	public void destroy() throws Exception {
		System.out.println(this+ "객체를 소멸합니다.");
	}

	public void init() throws Exception {
		System.out.println(this +"객체가 생성되었습니다.");
	}
	
	

}
