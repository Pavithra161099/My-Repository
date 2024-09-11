package com.corejavapractise;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.age =21;
		e.dependents=2;
		e.gender= "Female";
		e.empName= "Swathi";
		e.empCode= 123;
		e.salary= 80000;
		
		System.out.println("Employee Name is: "+ e.empName);
		System.out.println("Employee Code is: "+ e.empCode);
		System.out.println("Employee Age is: "+ e.age);
		System.out.println("Employee Gender is: "+ e.gender);
		System.out.println("Employee Salary is: "+ e.salary);
		System.out.println("Employee has "+ e.dependents + " dependents");
		
		System.out.println(e.eat());
		System.out.println(e.work());
		System.out.println(e.sleep());
		
		System.out.println(new Employee().work());
		
		

	}

}
