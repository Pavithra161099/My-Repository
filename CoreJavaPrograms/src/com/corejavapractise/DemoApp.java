package com.corejavapractise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoApp {

	// static int count=0;
	public static void main(String[] args) throws InterruptedException {

//		Demo2 d1 = new Demo2(10,20);
//
//		System.out.println(d1.a);
//		System.out.println(d1.b);
//		System.out.println(d1.c);
//		System.out.println(d1.d);

//
//		System.out.println("-------------------");
//		d1.display();
		// d1.display2();

//		DemoApp d= new DemoApp();
//		d.count++;
//		System.out.println(count);
//		DemoApp d1= new DemoApp();
//		d1.count++;
//		System.out.println(count);
//		DemoApp d2= new DemoApp();
//		d2.count++;
//		System.out.println(count);
//		DemoApp d3= new DemoApp();
//		d3.count++;
//		System.out.println(count);
//		DemoApp d4= new DemoApp();
//		d4.count++;
//		System.out.println(count);

//		Demo1 d1= new Demo1();
//		d1.display();
		Scanner scan = new Scanner(System.in);

//		try {
//			
//			System.out.println("enter 2 numbers: ");
//			int a = scan.nextInt();
//			int b= scan.nextInt();
//			int c= a/b;
//			System.out.println(c);
//			
//			System.out.println("================================");
//			
//			System.out.print("enter a lenght of array: ");
//			int len = scan.nextInt();
//			int arr[]= new int[len];
//			System.out.println(arr.length);
//			
//		}		
//		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NegativeArraySizeException | InputMismatchException e)
//		{
//			e.printStackTrace();
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		scan.close();

//		Thread t = Thread.currentThread();
//		System.out.println(t);

//		Demo d = new Demo();
//		Demo d1 = new Demo();
//		Demo d2 = new Demo();

//		Thread t1 = new Thread(d);
//		Thread t2 = new Thread(d1);
//		Thread t3 = new Thread(d2);

//		t1.start();
//		t2.start();
//		t3.start();

		try {
			System.out.println("Main activity is started and resources are alocated....");
			Demo d = new Demo();
			Demo d1 = new Demo();
			Demo d2 = new Demo();

			d.setName("print");
			d1.setName("mul");
			d2.setName("bank");

			d.start();
			d1.start();
			d2.start();

			System.out.println(d.isAlive());
			System.out.println(d1.isAlive());
			System.out.println(d2.isAlive());

			d.join();
			d1.join();
			d2.join();
			
			System.out.println(d.isAlive());
			System.out.println(d1.isAlive());
			System.out.println(d2.isAlive());
			
			System.out.println("Main activity is ended and resources are deallocated.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
