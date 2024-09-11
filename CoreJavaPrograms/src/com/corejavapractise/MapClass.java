package com.corejavapractise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {

		StudentClass sc1 = new StudentClass(121, "Raja", 20, "Male", 100, 3, 123456790, "raja123@gmail.com",
				"ABC College");
		StudentClass sc2 = new StudentClass(123, "Latha", 21, "Female", 75, 5, 127990, "latha1123@gmail.com",
				"GHI College");
		StudentClass sc3 = new StudentClass(100, "Raj", 20, "Male", 100, 3, 123356790, "raj123@gmail.com",
				"XYZ College");

		TreeMap hm = new TreeMap();

		hm.put(199, sc1);
		hm.put(188, sc2);
		hm.put(99, sc3);

		System.out.println(hm + "\n");
	}

}
