package com.corejavapractise;

import java.util.Scanner;

public class EmployeeApp1 {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a length: ");
//		int len=scan.nextInt();

		Employee1 arr[] = new Employee1[3];

		arr[0] = new Employee1("Ramu", 1, 1200);
		arr[1] = new Employee1("Raj", 2, 20000);
		arr[2] = new Employee1("Raju", 3, 30000);
		
		for (Employee1 e:arr) {
			System.out.println(e.id+ " "+e.name+" "+e.salary);
		}
	}

}
