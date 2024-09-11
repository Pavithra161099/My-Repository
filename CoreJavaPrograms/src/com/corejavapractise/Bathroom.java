package com.corejavapractise;

public class Bathroom implements Runnable {

	@Override
	synchronized public void run() {

		try {

			System.out.println(Thread.currentThread().getName() + " is entered bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is using bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is exiting bathroom");
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
