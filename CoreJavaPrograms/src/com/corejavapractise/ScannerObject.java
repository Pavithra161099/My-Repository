package com.corejavapractise;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		//if we take the input from user-> use Scanner object

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an number :");
		int a= scan.nextInt();
		System.out.println("The number is: "+a);
		
		System.out.print("Enter any decimal number :");
		float b= scan.nextFloat();
		System.out.println("The decimal number is: "+b);
		
		System.out.print("Enter true or false: ");
		boolean c = scan.nextBoolean();
		System.out.println("The entered boolean value is: "+c );
		
		System.out.print("Enter your name: ");
		String name = scan.next();
		System.out.println("Your name is: "+name);
		
		System.out.print("Enter your Full name: ");
		scan.nextLine();
		String fullname = scan.nextLine();
		System.out.println("Your Full name is: "+fullname);
		
		scan.close();

	}

}
