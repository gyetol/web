package org.example.mvcTest;

public class Info {
	private String name;
	private String major;
	
	public Info() {}

	public Info(String name, String major) {
		super();
		this.name = name;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s",name,major);
	}
}
