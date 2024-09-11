package com.corejavapractise;

public class Factory {

	int x;
	boolean producedOrNot = false;

	synchronized public void put(int i) throws InterruptedException {
		if (producedOrNot == true) {
			wait();
		}
		x = i;
		System.out.println("I have put " + i + " in Factory");
		producedOrNot = true;
		notify();
	}

	synchronized public void get() throws InterruptedException {
		if (producedOrNot == false) {
			wait();
		}
		System.out.println("I have taken " + x + " from Factory");
		producedOrNot = false;
		notify();
	}

}
