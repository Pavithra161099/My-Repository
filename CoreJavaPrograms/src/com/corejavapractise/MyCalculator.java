package com.corejavapractise;

public class MyCalculator implements  Calculator {

	@Override
	public void mul() {
		int a=20;
		int b=10;
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		int a = 20;
		int b = 10;
		int c = a / b;
		System.out.println(c);

	}

//	@Override
//	public void add() {
//		int a=20;
//		int b=10;
//		int c=a+b;
//		System.out.println(c);
//		
//	}
//
////	@Override
////	public void sub() {
////		int a=20;
////		int b=10;
////		int c=a-b;
////		System.out.println(c);
////		
////	}
//
//	@Override
//	public void mul() {
//		int a=20;
//		int b=10;
//		int c=a*b;
//		System.out.println(c);
//		
//	}
//
////	@Override
////	public void div() {
////		int a=20;
////		int b=10;
////		int c=a/b;
////		System.out.println(c);
////		
////	}

	
}
