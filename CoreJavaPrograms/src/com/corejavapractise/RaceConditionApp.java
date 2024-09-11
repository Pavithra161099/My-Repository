package com.corejavapractise;

public class RaceConditionApp {

	public static void main(String[] args) {

		MSExcel m1 = new MSExcel();
		MSExcel m2 = new MSExcel();
		MSExcel m3 = new MSExcel();

		m1.setName("type");
		m2.setName("check");
		m3.setName("save");
		
		m2.setDaemon(true);
		m3.setDaemon(true);
		
		m2.setPriority(7);
		m3.setPriority(9);

		m1.start();
		m2.start();
		m3.start();

	}

}
