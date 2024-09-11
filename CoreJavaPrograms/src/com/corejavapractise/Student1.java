package com.corejavapractise;

public class Student1 extends Human {

	
	int i=20;
	
	public void display() {
		System.out.println(i);
		System.out.println(super.i);
	}
	public void hasA1(Bike e) {

		System.out.println(e.color);
		System.out.println(e.cost);

	}

	public void hasA2(Book k) {

		System.out.println(k.author);
		System.out.println(k.cost);

	}
	
	

}
