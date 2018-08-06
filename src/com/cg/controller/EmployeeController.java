package com.cg.controller;

import java.util.HashMap;
import java.util.Map; //packages

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

public class EmployeeController { // class
	public EmployeeService employeeService;

	public void setService(EmployeeService employeeService) // constructor
	{
		this.employeeService = employeeService;
	}

	public void addEmployee(Map<String, String> employee) { // method declaration
		employeeService.addEmployee(employee);
	}

	public HashMap<Integer, Employee> viewAllEmployee() { // using Hash Map
		return employeeService.viewAllEmployee();
	}

	public Employee getEmployeeById(int id) {
		return employeeService.getEmployeeById(id);
	}

	public void deleteEmployee(int id) {
		employeeService.deleteEmployee(id);
	}
}
