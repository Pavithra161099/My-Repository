package com.corejavapractise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapViews {

	public static void main(String[] args) {

		// we have tree types of Map views
		// 1. keySet()- to access only keys in a map
		// 2. values()- to access only values in a map
		// 3. entrySet()- to access both keys&values in a map

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(100, "Sahana");
		hm.put(200, "Sara");
		hm.put(300, "Aana");
		hm.put(50, "Shilpa");
		hm.put(25, "Swati");
		hm.put(75, "Alan");
		hm.put(350, "Sindhu");

		// access only keys using keySet() method....

		Set key = hm.keySet();
		Iterator itr1 = key.iterator();
		System.out.println("Keys are present in a map: "+hm);
		while (itr1.hasNext() == true) {
			System.out.println(itr1.next());
		}
		System.out.println("------------------------------");

		// access only values using values() method....

		Collection value = hm.values();
		Iterator itr2 = value.iterator();
		System.out.println("Values are present in a map: "+hm);
		while (itr2.hasNext() == true) {
			System.out.println(itr2.next());
		}
		System.out.println("------------------------------");

		// access both keys and values using entrySet() method....

		Set es = hm.entrySet();
		Iterator itr3 = es.iterator();
		System.out.println("Keys&Values are present in map: "+hm);
		while (itr3.hasNext() == true) {
			System.out.println(itr3.next());
		}

	}

}
