package com.corejavapractise;

import java.util.ArrayList;
import java.util.Collections;

public class EmpApp {

	public static void main(String[] args) {

		Emp e1 = new Emp(1, "Raj", 20);
		Emp e2 = new Emp(2, "Sara", 40);
		Emp e3 = new Emp(3, "Ana", 24);
		Emp e4 = new Emp(4, "Alan", 30);

		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
//		Helper help = new Helper();

		Collections.sort(al);
		for (Emp emp : al) {
			System.out.println(emp);
		}

	}

}
