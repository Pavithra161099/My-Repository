package com.corejavapractise;

public interface Calculator {

	//public static final int a=10;
	public abstract void mul();
	public abstract void div();
	 //void add();
	
	default void add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	static void sub(){
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
}
