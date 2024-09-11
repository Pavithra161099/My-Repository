package com.corejavapractise;

import java.util.Scanner;

public class Demo2 implements Runnable {

	@Override
	public void run() {
		try {
//			Scanner scan = new Scanner(System.in);
			System.out.println("multiplication activity started... ");
//			System.out.println("enter 2 numbers for multiplication: ");
			int a = 123;
			int b = 456;
			Thread.sleep(5000);
			int c = a * b;
			System.out.println(c);
			System.out.println("multiplication activity ended. ");
//			scan.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

//	int c;
//	int d;
//	
//	public Demo2() {
//		a=10;
//		b=20;
//		c=30;
//		d=40;
//		
//		
//	}
//	public Demo2(int c, int d) {
//		a=100;
//		b=200;
//		this.c=c;
//		this.d=d;
//	}

//	void display2() {
//	Demo1 d1=new Demo1();
//	System.out.println(d1.a);
//	System.out.println(d1.b);
//	System.out.println(d1.c);

//	}

//	 public void gaama() {
//		 Demo1 d1= new Demo1();
//		 d1.beta();
//	 }

}
