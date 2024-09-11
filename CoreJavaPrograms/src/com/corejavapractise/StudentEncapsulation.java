package com.corejavapractise;

public class StudentEncapsulation {
	
	private String name;
	private int age;
	private int mark;
	private int rollno;
	
	public void setStudent(String a,int b,int c,int d) {
		name=a;
		age=b;
		mark=c;
		rollno=d;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMark() {
		return mark;
	}
	public int getRollno() {
		return rollno;
	}
	
	
	

	
}
