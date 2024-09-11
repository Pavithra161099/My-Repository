package com.corejavapractise;

public class Warrior extends Thread {

	String res1 = "Sarpastra";
	String res2 = "Garudastra";
	String res3 = "Pashupastra";

	@Override
	public void run() {
		if (getName().equals("arjuna")) {
			arjunaAcqRes();
		} else {
			karnaAcqRes();
		}

	}

	public void arjunaAcqRes() {

		try {
			Thread.sleep(5000);
			synchronized (res1) {
				System.out.println("Arjuna acquired " + res1);
				Thread.sleep(5000);
			}
			synchronized (res2) {
				System.out.println("Arjuna acquired " + res2);
				Thread.sleep(5000);
			}
			synchronized (res3) {
				System.out.println("Arjuna acquired " + res3);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void karnaAcqRes() {
		try {
			Thread.sleep(2000);
			synchronized (res3) {
				System.out.println("Karna acquired " + res1);
				Thread.sleep(2000);
			}
			synchronized (res2) {
				System.out.println("Karna acquired " + res2);
				Thread.sleep(2000);
			}
			synchronized (res1) {
				System.out.println("Karna acquired " + res3);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
