package com.corejavapractise;

import java.sql.SQLException;

public class Demo1 implements Runnable {

//	int a;
//	int b;
//
//	public Demo1() {
//
//	}
//
//	public Demo1(int a, int b) {
//
//		this.a=a;
//		this.b=b;
//		
//	}

//	// access specifier examples
//	public int a = 10;
//	protected int b = 20;
//	int c = 30;
//	private int d = 40;
//
//	 void display1() {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//	}

//	 public void  display() {
//		 System.out.println("Hello world");
//		return;
//		 
//	 }

//	 public void beta() {
//		 Demo d= new Demo();
//		 d.alpha();
//	 }

//	 public void display(){
//		 System.out.println("Hello World!");
//	 }

	@Override
	public void run() {
		try {
			System.out.println("printing activity started... ");

			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello World!");
				Thread.sleep(5000);
			}
			System.out.println("printing activity ended. ");

			System.out.println("----------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
