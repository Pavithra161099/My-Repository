package com.corejavapractise;

public class Employee1 {

	String name;
	int id;
	int salary;

	public String getName() {
		return name;
	}

	public Employee1(String name, int id, int salary) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

}
