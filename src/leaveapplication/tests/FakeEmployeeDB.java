package leaveapplication.tests;

import java.util.ArrayList;

public class FakeEmployeeDB {
	
	private ArrayList<Employee> employees;
	
	public FakeEmployeeDB() {
		this.employees = new ArrayList<Employee>();
	}

	public boolean isEmpty() {
		return employees.isEmpty();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

}
