package com.cg.dao;

import java.util.HashMap;
import java.util.Map; //packages

import com.cg.bean.Employee;

public class EmployeeDAO { // class

	HashMap<Integer, Employee> employee1 = new HashMap<>(); // using collection HashMap

	public void addEmployee(Map<String, String> employee) {
		Employee employees = new Employee(Integer.parseInt(employee.get("id")), employee.get("name"));
		employee1.put(Integer.parseInt(employee.get("id")), employees);
	}

	public HashMap<Integer, Employee> viewAllEmployee() {
		return employee1;
	}

	public Employee getEmployeebyId(int id) { // method declaration
		return employee1.get(id);
	}

	public void deleteEmployee(int id) {
		employee1.remove(id);
	}
}
