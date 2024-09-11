package com.corejavapractise;

public class ProblemDemo {

	public static void main(String[] args) throws InterruptedException {

		Bathroom b = new Bathroom();

		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);

		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Other");

		t1.start();
//		t1.join();

		t3.start();
//		t3.join();
		
		t2.start();
//		t2.join();

	}

}
