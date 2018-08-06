package com.cg.ui;

import java.io.BufferedReader; //packages
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.controller.EmployeeController;

public class EmployeeUI { // class
	Map<String, String> employee = new HashMap<>(); // using collection
	EmployeeController control;

	public void setControl(EmployeeController control) { // constructor
		this.control = control;
	}

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void start() throws NumberFormatException, IOException { // method declaration
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeController control = (EmployeeController) context.getBean("controller");
		setControl(control);

		accept();
	}

	private void accept() throws NumberFormatException, IOException { // accept method
		int choice;
		do {
			System.out.println(
					"Enter choice\n1.Add New Employee\n2. View all employees\n3. Get employee by id\n4. Delete an employee\n5.Exit");
			choice = Integer.parseInt(reader.readLine());

			switch (choice) {
			case 1:
				System.out.println("Enter employee name");
				employee.put("id", String.valueOf(Employee.getNextId())); // switch case
				employee.put("name", reader.readLine());
				control.addEmployee(employee);
				break;

			case 2:
				viewAll(control.viewAllEmployee());
				break;
			case 3:
				System.out.println("Enter employee id");
				control.getEmployeeById(Integer.parseInt(reader.readLine()));
				break;
			case 4:
				System.out.println("Enter employee id");
				control.deleteEmployee(Integer.parseInt(reader.readLine()));
				break;
			case 5:
				System.exit(1);
			}

		} while (true);
	}

	private void viewAll(HashMap<Integer, Employee> viewAllEmployee) { // view all method
		Set<Entry<String, String>> set = employee.entrySet();
		set.stream().forEach((element) -> System.out.println(element.getValue() + " " + element.getKey()));
	}
}
