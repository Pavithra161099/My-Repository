package com.corejavapractise;

public class StudentApp1 {

	public static void main(String[] args) {

		Student1 s = new Student1();

		Bike e = new Bike("black", 200000);
		s.hasA1(e);
		Book k = new Book("Sundar", 200);
		s.hasA2(k);

		System.out.println(s.b.color);
		System.out.println(s.b.weight);

		System.out.println(s.h.color);
		System.out.println(s.h.weight);

		s.display();

	}
}
