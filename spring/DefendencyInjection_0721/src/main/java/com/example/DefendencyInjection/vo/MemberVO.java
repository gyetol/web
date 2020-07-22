package com.example.DefendencyInjection.vo;

public class MemberVO {
	private String name;
	private int age;
	
	public MemberVO() {}
	

	public MemberVO(String name, int age) {
		this.name = name;
		this.age = age;
	}



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
		return String.format("%s,%d",name, age);
	}
	
}
