package com.corejavapractise;

public class MSExcel extends Thread {

	public void run() {

		if (getName().equals("type")) {
			typing();
		} else if (getName().equals("check")) {
			spellChecking();
		} else {
			autoSaving();
		}
	}

	public void typing() {

		try {
			for (int i = 1; i <= 4; i++) {
				System.out.println("Typing....");
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void spellChecking() {

		try {
			for (; ;) {
				System.out.println("Spell checking....");
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void autoSaving() {
		try {
			for (; ;) {
				System.out.println("Auto saving....");
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
