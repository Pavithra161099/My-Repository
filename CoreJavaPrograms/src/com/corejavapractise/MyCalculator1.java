package com.corejavapractise;

public class MyCalculator1 implements Calculator{

	@Override
	public void mul() {
		int a=20;
		int b=30;
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		int a=20;
		int b=2;
		int c=a/b;
		System.out.println(c);
		
	}
	
	public void add() {
		int a=20;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub() {
		int a=30;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}

	
}
