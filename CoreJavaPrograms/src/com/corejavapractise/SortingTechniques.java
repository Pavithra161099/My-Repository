package com.corejavapractise;

import java.util.Scanner;

public class SortingTechniques {

	public static void main(String[] args) {

		// 1. Bubble sort
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the length of an array: ");
//		int len = scan.nextInt();
//		int arr[] = new int[len];
//
//		System.out.println("Enter an array elements: ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("Enter an element of " + i + " is:");
//			arr[i] = scan.nextInt();
//		}
//		System.out.println("Array contents before sorting: ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//
//		}
//		System.out.println();
//
//		int help;
//		for (int i = 0; i <= arr.length - 2; i++) {
//			for (int j = 0; j <= arr.length - 2 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					help = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = help;
//				}
//
//			}
//		}
//
//		System.out.println("Array contents after sorting: ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//
//		}
//
//		scan.close();

		// 2.swap the contents of 2 indexes.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the length of an array: ");
//		int len = scan.nextInt();
//		int arr[] = new int[len];
//
//		System.out.println("Enter an array elements: ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("Enter an element of " + i + " is:");
//			arr[i] = scan.nextInt();
//		}
//		System.out.println("Array contents before sorting: ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//
//		}
//		System.out.println();
//
//		System.out.println("Enter an index-1 to swap");
//		int index1 = scan.nextInt();
//		System.out.println("Enter an index-2 to swap");
//		int index2 = scan.nextInt();
//		int help;
//
//		help = arr[index1];
//		arr[index1] = arr[index2];
//		arr[index2] = help;
//
//		System.out.println("Array contents after sorting: ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//
//		}
//
//		scan.close();

		
		//find out minimum number in array...
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of an array: ");
		int len = scan.nextInt();
		int arr[] = new int[len];

		
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print("Enter an element of " + i + " is: ");
			arr[i] = scan.nextInt();
		}
		System.out.println("Array contents are... ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

		int min =arr[0];
		int pos=0;

		for(int i=1; i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min= arr[i];
				pos=i;
			}
		}
		
		System.out.println("The minimum element in an array is "+ min +" at present in position "+pos);

		scan.close();

	}

}
