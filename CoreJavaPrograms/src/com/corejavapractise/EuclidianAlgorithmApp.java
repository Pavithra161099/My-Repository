package com.corejavapractise;

import java.util.Scanner;

public class EuclidianAlgorithmApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers to find out GCD: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		EuclidianAlgorithm ea = new EuclidianAlgorithm();

		int res = ea.findGcd(a, b);
		System.out.print("The GCD of " + a + " and " + b + " is: " + res);
		scan.close();

	}

}
