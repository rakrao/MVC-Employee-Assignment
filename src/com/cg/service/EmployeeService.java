package com.cg.service;

import java.util.HashMap; //packages
import java.util.Map;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDAO;

public class EmployeeService { // class
	public EmployeeDAO dao;

	public void setDao(EmployeeDAO dao) { // setter method
		this.dao = dao;
	}

	public void addEmployee(Map<String, String> employee) { // method declaration
		dao.addEmployee(employee);
	}

	public HashMap<Integer, Employee> viewAllEmployee() { // using HashMap collection
		return dao.viewAllEmployee();
	}

	public Employee getEmployeeById(int id) { // methods
		return dao.getEmployeebyId(id);
	}

	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}
}
