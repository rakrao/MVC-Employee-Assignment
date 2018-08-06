package com.cg.bean; //package

public class Employee { // class
	private int id;
	private String name; // instance member

	public static int employeeId;

	static {
		employeeId = 200;
	}

	public static int getNextId() {
		return employeeId + 1;
	}

	public Employee(int id, String name) { // constructor
		super();
		this.id = id;
		this.name = name;
	}

}
