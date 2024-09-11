package com.corejavapractise;

public class BlockedState {

	public static void main(String[] args) {
	
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		
		w1.setName("arjuna");
		w2.setName("karna");
		
		w1.start();
		w2.start();
		
	}

}
