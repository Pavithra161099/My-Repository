package com.corejavapractise;

public class Emp implements Comparable<Emp> {

	int id;
	String name;
	int age;

	public Emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age;
	}

//	public int compareTo(Emp other) {
//		return this.name.compareTo(other.name); // Compare by name
//	}

	public int compareTo(Emp o) {
		return this.name.compareTo(o.name);
	}

	

}
