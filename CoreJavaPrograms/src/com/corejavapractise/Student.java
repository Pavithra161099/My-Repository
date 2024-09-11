package com.corejavapractise;

public class Student {

	String id;
	String name;
	int age;

	public String getId() {
		return id;
	}

	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
