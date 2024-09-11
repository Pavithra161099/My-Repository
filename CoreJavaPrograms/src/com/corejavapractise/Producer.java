package com.corejavapractise;

public class Producer extends Thread{

	Factory ref;
	
	public Producer(Factory ref) {
		this.ref= ref;
	}
	
	public void run() {
		int j=0;
		while(true) {
			try {
				ref.put(++j);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
