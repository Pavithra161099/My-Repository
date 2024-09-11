package com.corejavapractise;

public class FanApp extends Object {

	
	public static void main(String[] args) {
		
		Fan f= new Fan(3, "Usha", 1000, "Green");
		//Fan f1= new Fan();
		//f.setFanData(3, "crompton", 3000, "Gold");
		System.out.println(f.getNoOfWings());
		System.out.println(f.getBrand());
		System.out.println(f.getCost());
		System.out.println(f.getColor());
//		System.out.println(f1.getNoOfWings());
//		System.out.println(f1.getBrand());
//		System.out.println(f1.getCost());
//		System.out.println(f1.getColor());

	}

}
