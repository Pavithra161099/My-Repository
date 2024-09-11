package com.corejavapractise;

import java.util.Scanner;

public class SearchCharApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a string: ");
		String s =scan.nextLine();
		
		System.out.print("enter a char to find out in a string: ");
		char c = scan.next().charAt(0);
		
		SearchCharacter sc= new SearchCharacter();
		int res=sc.check(s, c);
		if(res>=0) {
			System.out.println("the entered character present in string");
		}else {
			System.out.println("the entered character not present in string");
		}
		

	}

}
