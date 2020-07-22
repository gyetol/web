package spring.config;

import java.util.ArrayList;
import java.util.List;

import spring.Employee;
import spring.Manager;

public class ManagerImpl implements Manager {
	private List<Employee> employees;
	
	
	public ManagerImpl() {
		this.employees = new ArrayList<Employee>();
	}
	@Override
	public void pay() {
		for(Employee employee: employees) {
			System.out.printf("%s\t%s\t%d\n",employee.getName(),employee.getType(),employee.pay());
		}
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

}
