package com.corejavapractise;

import java.util.Scanner;

public class SubStringExcercise {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		
		System.out.print("Enter begin index: ");
		int b=scan.nextInt();
		
		System.out.print("Enter end index: ");
		int e=scan.nextInt();
		
		SubString ss= new SubString();
		System.out.println(ss.subString(str,b));
		System.out.println(ss.subString(str,b,e));
		
		
	}

}
