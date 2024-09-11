package com.corejavapractise;

import java.util.Scanner;

public class MyCalculator2 implements Calculator {

	Scanner scan = new Scanner(System.in);

	@Override
	public void mul() {

		System.out.println("Enter 2 numbers for multiplication: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		int c = a * b;
		System.out.println(c);

	}

	@Override
	public void div() {

		System.out.println("Enter 2 numbers for division: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		int c = a / b;
		System.out.println(c);

	}

}
