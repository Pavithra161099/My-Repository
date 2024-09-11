package com.corejavapractise;

import java.util.Scanner;

public class MyCalculator3 implements Calculator {

	Scanner scan = new Scanner(System.in);

	@Override
	public void mul() {

		System.out.println("Enter 2 numbers for multiplication: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a == 0 || b == 0) {
			System.out.println("Idiot....why do you need calulator then ");
		} else {

			int c = a * b;
			System.out.println(c);
		}

	}

	@Override
	public void div() {

		System.out.println("Enter 2 numbers for division: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (b == 0) {
			System.out.println("Go and learn math first.... ");
		} else {

			int c = a / b;
			System.out.println(c);
		}

	}

}
