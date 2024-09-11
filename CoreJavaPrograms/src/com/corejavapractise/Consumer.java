package com.corejavapractise;

public class Consumer extends Thread {

	Factory ref;

	public Consumer(Factory ref) {
		this.ref = ref;
	}

	public void run() {
		while (true) {
			try {
				ref.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
