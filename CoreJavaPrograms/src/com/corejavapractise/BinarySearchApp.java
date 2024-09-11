package com.corejavapractise;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a lenght of an array: ");
		int len = scan.nextInt();
		int arr[]= new int [len];
		
		for(int i=0; i<=arr.length-1; i++){
			System.out.println("enter a integers: ");
			arr[i]=scan.nextInt();
		}
		
		System.out.println("enter a integer to search: ");
		int key = scan.nextInt();
				
		BinarySearch bs= new BinarySearch();
		boolean res = bs.binarySearch(arr, key);
		
		if(res==true) {
			System.out.println("key found");
		}else {
			System.out.println("key not found");
		}
		
	}

}
