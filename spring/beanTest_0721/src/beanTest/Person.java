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
		return String.format("�̸�: %s, ����: %d��", name,age);
	}


	public void destroy() throws Exception {
		System.out.println(this+ "��ü�� �Ҹ��մϴ�.");
	}

	public void init() throws Exception {
		System.out.println(this +"��ü�� �����Ǿ����ϴ�.");
	}
	
	

}
