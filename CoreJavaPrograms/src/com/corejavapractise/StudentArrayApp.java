package com.corejavapractise;

import java.util.Scanner;

public class StudentArrayApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter no.of students: ");
		int len = scan.nextInt();
		Student sa[] = new Student[len];

		for (int i = 0; i <= sa.length - 1; i++) {
			//sa[i] = new Student();
		}

		for (int i = 0; i <= sa.length - 1; i++) {
			System.out.print("Enter a student " + i + "'s age: ");
			sa[i].age = scan.nextInt();
			System.out.print("Enter a student " + i + "'s Name: ");
			sa[i].name = scan.next();
			System.out.print("Enter a student " + i + "'s age: ");
			sa[i].age= scan.nextInt();
		}

		System.out.println("Array contents are before sorting....");
		for (int i = 0; i <= sa.length - 1; i++) {
			System.out.println(sa[i].name + " " + sa[i].age + " " + sa[i].age);
		}

		// bubble sort - use help var and formula is n-2 n-2-i and swap it
		Student help;
		for (int i = 0; i <= sa.length - 2; i++) {
			for (int j = 0; j <= sa.length - 2 - i; j++) {

				if (sa[j].age > sa[j + 1].age) {

					help = sa[j];
					sa[j] = sa[j + 1];
					sa[j+1] = help;
				}
			}
		}
		
		System.out.println("Array contents are after sorting....");
		for (int i = 0; i <= sa.length - 1; i++) {
			System.out.println(sa[i].name + " " + sa[i].age + " " + sa[i].age);
		}

		scan.close();

	}

}
