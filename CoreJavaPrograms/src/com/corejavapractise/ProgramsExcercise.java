package com.corejavapractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class ProgramsExcercise {

//	String StudentName;
//	int age;
//	String studentCode;

	public static void main(String[] args) {

		// 1. calculate a factorial of a number using for, while and do-while loop
		// formula-> fact = fact*i
//		//using for loop
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int n= scan.nextInt();
//		int fact=1;
//		for(int i=1; i<=n; i++) {
//			fact= fact*i;
//		}
//		System.out.print("The factorial of "+ n + " is: "+ fact);
//		scan.close();

//		// using while loop
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int n = scan.nextInt();
//		int fact = 1, i=1;
//		while(i <= n) {
//			fact = fact * i;
//			i++;
//		}
//		System.out.print("The factorial of " + n + " is: " + fact);
//		scan.close();

//		// using do-while loop
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int n = scan.nextInt();
//		int fact = 1, i = 1;
//		do{
//			fact = fact * i;
//			i++;
//		}while(i<=n);
//		System.out.print("The factorial of " + n + " is: " + fact);
//		scan.close();

//		//Factor of number -> means 2 if a factor 4.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int n = scan.nextInt();
//		int i = 5;
//		if (n % i == 0) {
//			System.out.println(i);
//		}
//		scan.close();

//		//search a particular element in an array->use linear search algorithm
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the length of array: ");
//		int ele = scan.nextInt();
//		int arr[] = new int[ele];
//		for(int i=0; i<=arr.length-1; i++) {
//			System.out.print("Enter an array elements: ");
//			arr[i] = scan.nextInt();
//		}
//		System.out.print("Enter a number to find out in an array: ");
//		int key =scan.nextInt();
//		for(int i=0; i<=arr.length-1; i++) {
//			if(key==arr[i]) {
//				System.out.print("Key is found at index: "+i);
//				System.exit(0);
//			}
//		}
//		System.out.println("Key not found...");
//		scan.close();

//		// search an element by using binary search algorithm
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the length of an array: ");
//		int len = scan.nextInt();
//		int arr[] = new int[len];
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("Enter an array elements: ");
//			arr[i] = scan.nextInt();
//		}
//		int mid, high, low;
//		high = arr.length - 1;
//		low = 0;
//		System.out.print("Enter an number to find out: ");
//		int key = scan.nextInt();
//		while (low <= high) {
//			mid = (low + high) / 2;
//			if (key == arr[mid]) {
//				System.out.print("Key found at index: " + mid);
//				System.exit(0);
//			} else if (key > arr[mid]) {
//				low = mid + 1;
//				high = high;
//			} else {
//				high = mid - 1;
//				low = low;
//			}
//		}
//		System.out.println("Key not found");
//		scan.close();

		// 1.
		// System.out.println("*");

//		//2.
//		for(int i=1; i<=5;i++) {
//		System.out.print("*");
//		}

//		// 3.
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("*");
//		}

		// 4.
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}

		// 5.
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 6.
//		for (int i = 5; i >=1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 7.
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= 4; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 8.
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i == 1 || i == 5 || j == 1 || j == 5) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		// 9.
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= (6 - i); j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= (2 * i) - 1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 10.
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= (11-2 * i); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 11.
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= (6 - i); j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= (2 * i) - 1; k++) {
//				if (k == 1 || i == 5 || k == (2 * i - 1)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		// 12.
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= (6 - i); j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= (2 * i) - 1; k++) {
//				if (k == 1 || i == 5 || k == (2 * i - 1)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		// 13,
//		ProgramsExcercise p1 = new ProgramsExcercise();
//		p1.age = 20;
//		p1.StudentName = "Ramu";
//		p1.studentCode = "KOD001";
//
//		ProgramsExcercise p2 = new ProgramsExcercise();
//		p2.age = 23;
//		p2.StudentName = "Raaju";
//		p2.studentCode = "KOD002";
//
//		ProgramsExcercise p3 = new ProgramsExcercise();
//		p3.age = 18;
//		p3.StudentName = "Rama";
//		p3.studentCode = "KOD003";
//
//		ProgramsExcercise p[] = new ProgramsExcercise[3];
//		p[0] = p1;
//		p[1] = p2;
//		p[2] = p3;
//		
//		for(int i=0; i<=p.length-1;i++) {
//			System.out.print(p[i].age+ " "+p[i].studentCode+" "+p[i].StudentName+ " ");
//		}

		// 14.replace the specified char of string

//		String s = "SitaMahalakshmi";
//		System.out.println(s);
//		System.out.println(s.replace('i', 'J'));

		// 15. replace string from hello to hai

//		String s = "hello Hello Omakr hello";
//		System.out.println(s);
//		s= s.replaceAll("hello", "Hai");
//		System.out.println(s);

		// 16. convert string to char array...

//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the string: ");
//		String str = scan.nextLine();
//		
//		char arr[] =str.toCharArray();
//		for (int i=0; i<=arr.length-1; i++) {
//			System.out.print (arr[i]+ " ");
//		}

//		scan.close();

		// 17.reverse a string...

//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the string: ");
//		String str = scan.nextLine();
//		
//		char cha[] = str.toCharArray();
//		for (int i=0; i<=cha.length-1; i++) {
//			System.out.print(cha[i]+" ");
//		}
//		System.out.println();
//		char cha2[] = new char[cha.length];
//		int j= cha2.length-1;
//		
//		for (int i=0; i<=cha.length-1; i++) {
//			cha2[j] = cha[i];
//			j--;
//		}
//		str = new String(cha2);
//		System.out.println(str);

		// 18. reverse a string by preserving the spaces...

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();

		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length];

		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr1[i] == ' ') {
				arr2[i] = arr1[i];
			}
		}

		int j = arr2.length - 1;
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr1[i] != ' ') {
				while (arr2[j] == ' ') {
					j--;
				}
				arr2[j] = arr1[i];
				j--;

			}
		}
		System.out.println(new String(arr2));
		scan.close();

		//
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=5; j++) {
//				System.out.print();
//			}
//			System.out.println();
//		}

		//
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		//
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		//
//		for (int i=1; i<=5; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

		// Floyd's triangle
//		int count =1;
//		for (int i=1; i<=4; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print(count+ " ");
//				count++;
//				
//			}
//			System.out.println();
//		}

		// pascal's triangle
//		int n = 7;
//		for (int i = 1; i <= n; i++) {
//			
//			for (int k = 1; k <= n - i; k++) {
//				System.out.print(" ");
//			}
//			int count = 1;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(count + " ");
//				count = count*(i - j)/j;
//			}
//
//			System.out.println();
//
//		}

		//
//		

		//
//		int alpha=65;
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print((char)alpha);
//			}
//			alpha++;
//			System.out.println();
//		}

		//
//		int alpha=65;
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=4; j++) {
//				System.out.print((char)alpha);
//				alpha++;
//			}
//			
//			System.out.println();
//		}

		//
//		int alpha = 65;
//		for (int i = 1; i <= 4; i++) {
//			alpha = 65;
//			for (int j = 1; j <= i; j++) {
//				System.out.print((char) alpha+ " ");
//				alpha++;
//			}
//			
//			System.out.println();
//		}

		// pgm to print a number from 1 to n
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Enter a number: ");
//		int n =scan.nextInt();
//		
//		for (int i=1; i<=n; i++) {
//			System.out.print(i+ " ");
//		}

		// print odd numbers from 1 to n
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Enter a number: ");
//		int n = scan.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			if (i % 2 != 0) {
//				System.out.print(i + " ");
//			}
//		}

		// print even numbers from 1 to n
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Enter a number: ");
//		int n = scan.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//		}

		// prime number
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Enter a number: ");
//		int n = scan.nextInt();
//		for (int i = 1; i <= n; i++) {
//			int count = 0;
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.print("The prime numbers found between from 1 to " + n + " is: " + i);
//				System.out.println();
//			}
//			
//		}

		// factorial of number
//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a number: ");
//		int n = scan.nextInt();
//		int fact=1;
//		for(int i=1; i<=n; i++) {
//			fact=fact*i;
//		}
//		System.out.print("The factorial of "+ n + " is: "+fact);

		// fibanocci series
//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a number: ");
//		int n = scan.nextInt();
//
//		int n1 = 0;
//		int n2 = 1;
//		int sum = 0;
//
//		System.out.print(n1+ " "+n2);
//		for (int i = 3; i <= n; i++) {
//			sum = n1 + n2;
//			n1 = n2;
//			n2 = sum;
//			System.out.print(" "+sum);
//		}

//		// addition of matrix
//		Scanner scan = new Scanner(System.in);
//
//		int a[][] = new int[2][2];
//		int b[][] = new int[2][2];
//		int c[][] = new int[2][2];
//
//		// 1st array
//		System.out.println("Enter the elements for first array....");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print("Enter values for " + i + " " + j + " :");
//				a[i][j] = scan.nextInt();
//			}
//		}
//		System.out.println("First array is....");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//		// 2nd array
//		System.out.println("Enter the elements for second array....");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print("Enter values for " + i + " " + j + " :");
//				b[i][j] = scan.nextInt();
//			}
//
//		}
//		System.out.println("second array is....");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(b[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		// addition of array
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//			}
//
//		}
//		System.out.println("The addition of array is: ");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//
//		// multiplication of array
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				c[i][j] = 0;
//				for (int k = 0; k < 2; k++) {
//					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
//				}
//			}
//
//		}
//		System.out.println("The multiplication of array is: ");
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}

//		//singleton pattern
//		PrimeMinister pm1=PrimeMinister.factory();
//		System.out.println(pm1);
//		PrimeMinister pm2=PrimeMinister.factory();
//		System.out.println(pm2);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a lenth:");
//		int len = scan.nextInt();

//		int arr[] = new int[len];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.println("enter elements: ");
//			arr[i] = scan.nextInt();
//		}

//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.println(arr[i]);
//			
//		}

//		//for-each loop
//		for (int x:arr) {
//			System.out.println(x);
//		}

//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a lenth:");
//		int len = scan.nextInt();

//		String arr[] = new String[len];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("enter elements: ");
//			arr[i] = scan.next();
//		}
//		
//		for(String s:arr) {
//			System.out.println(s);
//		}
//		float arr[] = new float[len];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("enter elements: ");
//			arr[i] = scan.nextFloat();
//		}
//
//		float sum = 0;
//		for (float s : arr) {
//			sum = sum + s;
//		}
//		System.out.println(sum);

		// count the no.of words in a given array...
//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a string:");
//		String str = scan.nextLine();
//
//		String arr[] = str.split(" ");
//
//		int count = arr.length;
//
//		System.out.print("The No.of words in an given array: " + count);

//		// count the no.of alphabets in a given string...
//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a string:");
//		String str = scan.nextLine();
//
//		String arr[] = str.split(" ");
//		System.out.print("enter a index of the word:");
//		int ind = scan.nextInt();
//
//		if (ind >= 0 && ind < arr.length) {
//			char ca[] = arr[ind].toCharArray();
//			System.out.print("The No.of alphabets in an given string: " + ca.length);
//		}
//
//		else {
//			System.out.print("pls enter a correct index");
//		}

		// remove a specific character in a given string
//		Scanner scan = new Scanner(System.in);
//		System.out.print("enter a string:");
//		String str = scan.nextLine();
//
//		System.out.print("enter a character which you want to remove:");
//		String rem = scan.next();
//
//		str = str.replace(rem, "");
//
//		System.out.println(str);

		// count the no.of vowels in a given string
		// way-1:
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//
//		str = str.toLowerCase();
//
//		char arr[] = str.toCharArray();
//		int count = 0;
//		for (int i = 0; i <= arr.length - 1; i++) {
//			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
//				count++;
//			}
//		}
//
//		System.out.println(count);

		// way-2:
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//
//		str = str.toLowerCase();
//
//		int count = 0;
//		for (int i = 0; i <= str.length() - 1; i++) {
//			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//					|| str.charAt(i) == 'u') {
//				count++;
//			}
//		}
//
//		System.out.println(count);

		// change the char to A after the space in a given string
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//		StringBuffer sb = new StringBuffer(str);
//		for (int i = 0; i <= sb.length() - 1; i++) {
//			if (sb.charAt(i) == ' ') {
//				sb.setCharAt(i + 1, 'A');
//			}
//		}
//		System.out.println(sb);

		// count the consonants in a given string
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//		str = str.toLowerCase();
//		int count = 0;
//		for (int i = 0; i <= str.length() - 1; i++) {
//			if (str.charAt(i) != 'a' && str.charAt(i) != 'e'&& str.charAt(i) != 'i' && str.charAt(i) != 'o'
//					&& str.charAt(i) != 'u') {
//				count++;
//			}
//		}
//
//		System.out.println(count);

		// count no.of digits present in a given string.

//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//		int count = 0;
//		for (int i = 0; i <= str.length() - 1; i++) {
////			if (str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3'
////					|| str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7'
////					|| str.charAt(i) == '8' || str.charAt(i) == '9') {
//			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//				count++;
//			}
//		}
//		System.out.println(count);

//		// convert all upper case letters to lower case
//
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//		for (int i = 0; i <= str.length() - 1; i++) {
//			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//				str = str.toLowerCase();
//			}
//		}
//		System.out.println(str);

		// convert all lower case letters to upper case

//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//		for (int i = 0; i <= str.length() - 1; i++) {
//			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//				str = str.toUpperCase();
//			}
//		}
//		System.out.println(str);

		// problem associated with sort() method.....

//		PriorityQueue pq= new PriorityQueue();
//		
//		pq.add(100);
//		pq.add(25);
//		pq.add(175);
//		pq.add(125);
//		pq.add(50);
//		pq.add(175);
//		pq.add(75);
//		System.out.println(pq);

//		TreeSet ts = new TreeSet();
//		ts.add(1221);
//		ts.add(918);
//		ts.add(8319);
//		ts.add(892);
//
//		System.out.println(ts);
//		System.out.println("----------------------");

//		ArrayList al = new ArrayList();
//		al.addAll(pq);
//		Collections.sort(al);
//
//		System.out.println(al);

		// Other important methods in collections class....

//		ArrayList al = new ArrayList();
//		al.add(100);
//		al.add(25);
//		al.add(175);
//		al.add(125);
//		al.add(50);
//		al.add(175);
//		al.add(75);
//
//		System.out.println("al----->" + al);
//
//		System.out.println(Collections.binarySearch(al, 125));
//		System.out.println("-------------------------------");
//		System.out.println(Collections.binarySearch(al, 200));
//		System.out.println("-------------------------------");
//		System.out.println(Collections.min(al));
//		System.out.println(Collections.max(al));
//		System.out.println("-------------------------------");
//		System.out.println(Collections.frequency(al, 175));
//		System.out.println(Collections.frequency(al, 200));
//		System.out.println("al----->" + al);
//		System.out.println("-------------------------------");
//		System.out.println(Collections.replaceAll(al, 175, 999));
//		System.out.println("al----->" + al);
//		System.out.println("-------------------------------");
//		System.out.println(Collections.replaceAll(al, 200, 999));
//		System.out.println("al----->" + al);
//		System.out.println("-------------------------------");
//		Collections.rotate(al, 1);
//		System.out.println("al----->" + al);
//		System.out.println("-------------------------------");
//		Collections.rotate(al, 1);
//		System.out.println("al----->" + al);
//		System.out.println("-------------------------------");
//		Collections.rotate(al, 2);
//		System.out.println("al----->" + al);
//		System.out.println("-------------------------------");
//		Collections.shuffle(al);
//		System.out.println("al----->" + al);
//		System.out.println("-------------------------------");

		// check whether the given string is a rotation of another string.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter First string: ");
//		String str1 = scan.nextLine();
//		System.out.print("Enter Second string: ");
//		String str2 = scan.nextLine();
//
//		if (str1.length() != str2.length()) {
//			System.out.println("1st string is not rotational of 2nd string");
//			System.exit(0);
//		} else {
//			str1 = str1.concat(str1);
//			if (str1.indexOf(str2) != -1) {
//				System.out.println("2nd string is a rotational of 1st string");
//			} else {
//				System.out.println("2nd string is a rotational of 1st string");
//			}
//		}

		// swap the first and last characters of each word in a given string.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//		char arr[] = str.toCharArray();
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			int k = i;
//			while (i <= arr.length - 1 && arr[i] != ' ') {
//				i++;
//			}
//			char help = arr[k];
//			arr[k] = arr[i - 1];
//			arr[i - 1] =  help;
//
//		}
//		System.out.println(new String(arr));

		// check whether the given string contains duplicates words or not. If
		// duplicates words are given print it to the output screen.

//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String str = scan.nextLine();
//
//		String words[] = str.split(" ");
//
//		int count;
//		for (int i = 0; i <= words.length - 1; i++) {
//			count = 1;
//			for (int j = i + 1; j <= words.length - 1; j++) {
//
//				if (words[i].equals(words[j])) {
//					count++;
//					words[j] = "0";
//				}
//			}
//
//			if (count > 1 && words[i] != "0") {
//				System.out.println(words[i]);
//			}
//		}
//
//		scan.close();

	}
}
