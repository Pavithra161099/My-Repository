package com.corejavapractise;

public class MobileApp {

	public static void main(String[] args) {

		Mobile m = new Mobile();

		System.out.println(m.o.getType());
		System.out.println(m.o.getName());
		
		Charger c= new Charger("white", "samsung");
		m.hasA(c);
		c.getBrand();
		c.getColor();
		
		System.out.println("=============================================");
//		m=null;
//		m.hasA(c);
//		//threw null pointer exception
//		System.out.println(m.o.getType());
//		System.out.println(m.o.getName());
//		
//		c.getBrand();
//		c.getColor();
		

	}

}
