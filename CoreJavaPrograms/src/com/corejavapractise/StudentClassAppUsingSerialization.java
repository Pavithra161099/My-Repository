package com.corejavapractise;

import java.io.Serializable;

public class StudentClassAppUsingSerialization implements Serializable {

	String name;
	transient int age;
	transient int mark;

	public StudentClassAppUsingSerialization(String name, int age, int mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}

	public void diplay() {
		System.out.println(name + " " + age + " " + mark);
	}

}
