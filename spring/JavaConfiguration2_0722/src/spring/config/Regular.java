package spring.config;

import spring.Employee;

public class Regular implements Employee {
	public static String TYPE= "Á¤±ÔÁ÷";
	private String name;
	private int salary;
	
	public Regular(String name,int salary) {
		this.name = name;
		this.salary=salary;
	}

	@Override
	public int pay() {
		
		return (salary/12);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
