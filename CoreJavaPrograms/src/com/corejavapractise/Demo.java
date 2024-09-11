package com.corejavapractise;

import java.sql.SQLException;
import java.util.Scanner;

public class Demo extends Thread {

//	static int count = 0;
//
//	public Demo() {
//		count++;
//	}

//	public void display() {
//		System.out.println("Hello");
//	}

//	public static void main(String[] args) {
//		System.out.println("Connection established....");
//		Scanner scan = new Scanner(System.in);
//		try {
//
//			System.out.println("Enter 2 numbers: ");
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			int c = a / b;
//			System.out.println(c);
//			
//		} catch (ArithmeticException ae) {
//			// ae.printStackTrace();
//			System.out.println("Arithmetic exception occured and enter a +ve values for inputs...");
//
//		}
//
//		try {
//			System.out.println("Enter a length of an array: ");
//			int len = scan.nextInt();
//			int arr[] = new int[len];
//
//			System.out.println("Enter a element: ");
//			int elem = scan.nextInt();
//			System.out.println("Enter a position value to be element inserted: ");
//			int pos = scan.nextInt();
//			arr[pos] = elem;
//
//		}
//
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("Input a position value within range of array (0 to len)");
//
//		} catch (NegativeArraySizeException e) {
//
//			System.out.println("Input a postive value for array size as it's only expecting range starts from 0 to n");
//		} catch (Exception e) {
//
//			System.out.println("Something wrong....pls try again");
//		}
//		
//		System.out.println("Connection terminated.");
//		scan.close();
//
//	}

//	public void alpha() {
//		
////		Scanner scan = new Scanner(System.in);
////		System.out.println("enter 2 numbers: ");
////		int a =scan.nextInt();
////		int b =scan.nextInt();
////		int c=a/b;
////		System.out.println(c);
//		
////		alpha();
//		
//		
//		
//	}

//	public void display()  throws ArrayIndexOutOfBoundsException{
//		
//		System.out.println("Hello");
//	}

//	public static void main(String[] args) throws InterruptedException {

//		Thread t = new Thread();
//		//Thread.currentThread();
//		t.setPriority(7);
//		t.setName("Pavi");
//		System.out.println(t);

	@Override
	public void run() {

		if (getName().equals("print")) {
			print();
		} else if (getName().equals("mul")) {
			mul();
		} else {
			bank();
		}
	}

	public void bank() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("bank activity started... ");
			System.out.print("Enter the account no: ");
			int accno = scan.nextInt();
			System.out.print("Enter password: ");
			int pwd = scan.nextInt();
			System.out.println("bank activity ended. ");
			scan.close();
			System.out.println("----------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void print() {
		try {
			System.out.println("printing activity started... ");

			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello World!");

			}
			System.out.println("printing activity ended. ");

			System.out.println("----------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mul() {
		try {
			System.out.println("multiplication activity started... ");
			int a = 123;
			int b = 456;
			Thread.sleep(5000);
			int c = a * b;
			System.out.println(c);
			System.out.println("multiplication activity ended. ");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
