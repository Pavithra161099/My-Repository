package com.corejavapractise;

public class StudentApp {

	public static void main(String[] args) {
		
//		StudentEncapsulation s= new StudentEncapsulation();
//		s.setStudent("Ramu", 20, 100, 123);
//		System.out.println(s.getName());
//		System.out.println(s.getAge());
//		System.out.println(s.getRollno());
//		System.out.println(s.getMark());
		

		Student arr[]= new Student[3];
		Student s1= new Student("KOD001", "Ram", 20);
		Student s2= new Student("KOD002", "Raj", 23);
		Student s3= new Student("KOD003", "Rakesh", 19);
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		
		for(Student s:arr) {
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		
		
	}

}
