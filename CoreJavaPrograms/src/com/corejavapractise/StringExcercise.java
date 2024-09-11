package com.corejavapractise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringExcercise {

	String name;
	int age;

	public static void main(String[] args) {

		// 1.
//		String s1 = "Rama";
//		String s2 = "Rama";
//
//		if (s1 == s2) {
//			System.out.println("References are Equal");
//		} else {
//			System.out.println("References are NOT Equal");
//		}

		// 2.
//		String s1 = "Rama";
//		String s2 = "Rama";
//
//		if (s1.equals(s2)) {
//			System.out.println("References are Equal");
//		} else {
//			System.out.println("References are NOT Equal");
//		}

		// 3.
//		String s1 = new String("Rama");
//		String s2 = new String("Rama");
//		if (s1 == s2) {
//			System.out.println("References are Equal");
//		} else {
//			System.out.println("References are NOT Equal");
//		}
//
//		if (s1.equals(s2)) {
//			System.out.println("String are Equal");
//		} else {
//			System.out.println("Strings are NOT Equal");
//		}

		// 4.
//		String s1 = new String("Rama");
//		String s2 = "Rama";
//		if (s1 == s2) {
//			System.out.println("References are Equal");
//		} else {
//			System.out.println("References are NOT Equal");
//		}
//
//		if (s1.equals(s2)) {
//			System.out.println("String are Equal");
//		} else {
//			System.out.println("Strings are NOT Equal");
//		}

		// 5.
//		String s1 = new String("Rama");
//		String s2 = "RAMA";
//		if (s1 == s2) {
//			System.out.println("References are Equal");
//		} else {
//			System.out.println("References are NOT Equal");
//		}
//
//		if (s1.equals(s2)) {
//			System.out.println("String are Equal");
//		} else {
//			System.out.println("Strings are NOT Equal");
//		}

		// 6.
//		String s1 = new String("Rama");
//		String s2 = "RAMA";
//		if (s1 == s2) {
//			System.out.println("References are Equal");
//		} else {
//			System.out.println("References are NOT Equal");
//		}
//
//		if (s1.equals(s2)) {
//			System.out.println("String are Equal");
//		} else {
//			System.out.println("Strings are NOT Equal");
//		}
//
//		if (s1.equalsIgnoreCase(s2)) {
//			System.out.println("String are Equal if we use ignore case");
//		} else {
//			System.out.println("Strings are NOT Equal if we use ignore case");
//		}

		// 7.
//		String s1 = "Rama";
//		System.out.println(s1);
//		s1.concat("sita");
//		System.out.println(s1);

		// 8.
//		String s1 = "Rama";
//		System.out.println(s1);
//		s1 = s1.concat("sita");
//		System.out.println(s1);

		// 9.
//		String s1 = "Rama";
//		System.out.println(s1);
//		String s2 = "Sita";
//		System.out.println(s2);
//		String s3 = "Rama"+"Sita";
//		System.out.println(s3);
//		String s4 = "Rama"+"Sita";
//		System.out.println(s4);
//		if(s3==s4) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("Reference are not equal");
//		}
//		if(s3.equals(s4)) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("Strings are not equal");
//		}

		// 10.
//		String s1 = "Rama";
//		System.out.println(s1);
//		String s2 = "Sita";
//		System.out.println(s2);
//		String s3 = s1+s2;
//		System.out.println(s3);
//		String s4 = s1+s2;
//		System.out.println(s4);
//		if(s3==s4) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("Reference are not equal");
//		}
//		if(s3.equals(s4)) {
//			System.out.println("Strings are equal");
//		}else {
//			System.out.println("Strings are not equal");
//		}

		// 11.
//		String s1 = "Rama";
//		System.out.println(s1);
//		String s2=s1;
//		if(s1==s2) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("Reference are not equal");
//		}
//		if(s1.equals(s2)) {
//			System.out.println("Strings are equal");
//		} else {
//			System.out.println("Strings are not equal");
//		}

		// 12.
//		String s1 = "qqqs";
//		String s2 = "qqqa";
//		if (s1.compareTo(s2)> 0) {
//			System.out.println("s1 is greater");
//		} else if(s1.compareTo(s2)<0){
//			System.out.println("s2 is greater");
//		}else {
//			System.out.println("string are equal");
//		}

		// 13.
//		String s1="Pavi";
//		System.out.println(s1);
//		String s2=s1.intern();
//		System.out.println(s2);
//		String s3= "Pavi";
//		System.out.println(s3);
//		if(s1==s3) {
//			System.out.println("Reference are equal");
//		}else {
//			System.out.println("Reference are not equal");
//		}

		// 14.
//		String s1 = "Pavithra Raman";
//		System.out.println(s1);
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.contains("Ram"));
//		System.out.println(s1.indexOf('m'));
//		System.out.println(s1.charAt(9));
//		System.out.println(s1.substring(3));
//		System.out.println(s1.substring(3, 10));

		// 15.
//		StringBuffer sb = new StringBuffer("Rama");
//		System.out.println(sb);
//		sb.append("Sita");
//		System.out.println(sb);

		// 16.
//		StringBuilder sb = new StringBuilder("Rama");
//		System.out.println(sb);
//		sb.append("Sita");
//		System.out.println(sb);

		// 17.
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.append("Dravid is a Batsman");
//		System.out.println(sb.capacity());

		// 18.
//		StringBuilder sb = new StringBuilder();
//		System.out.println(sb.capacity());
//		sb.append("Dravid is a Batsman");
//		System.out.println(sb.capacity());
//		sb.append("12345678906545343434442323232323343445456565676788");
//		System.out.println(sb.capacity());

		// 19.ensure capacity
//		StringBuilder sb = new StringBuilder();
//		sb.ensureCapacity(50);
//		System.out.println(sb.capacity());
//		sb.append("318218362445634473439423139193284374364535434347342938231323623264236232");
//		System.out.println(sb.capacity());

		// 20.String tokenizer
//		StringTokenizer st = new StringTokenizer("Raja Ram Mohan Roy", " ");
//		
//		while(st.hasMoreTokens()==true) {
//			System.out.println(st.nextToken());
//		}

		// 21.Hashcode

//		String s1 = new String("RajaRamMohanRoy");
//		System.out.println(s1);
//		StringExcercise s2 = new StringExcercise();
//		System.out.println(s2);

		// 22. split () and reverse a string

//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a string: ");
//		String str = scan.nextLine();
//		String arr[] = str.split(" ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		String arr2[] = new String[arr.length];
//		int j = arr2.length - 1;
//		for (int i = 0; i <= arr.length - 1; i++) {
//			
//			arr2[j] = arr[i];
//			j--;
//		}
//
//		
//		System.out.println(arr2);
		
		//23.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a string: ");
//		String s1 = scan.nextLine();
//		s1= s1.replace(" ", "$");
//		System.out.println(s1);

	}

}
