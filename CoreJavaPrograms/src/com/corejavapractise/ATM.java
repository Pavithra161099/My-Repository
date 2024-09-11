package com.corejavapractise;

import java.util.Scanner;

public class ATM {

	int accno = 1111;
	int pwd = 9999;
	int uacc;
	int upwd;

	public void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter Account no: ");
		uacc = scan.nextInt();
		System.out.print("enter password: ");
		upwd = scan.nextInt();
		scan.close();
	}

	
	public class InvalidInputException extends Exception {

		public String getMessage() {

			return "Invalid acc no/pwd......Plz try again";

		}
	}

	public void verify() throws Exception {
		if (uacc == accno && upwd == pwd) {
			System.out.println("take your money");
		} else {
			InvalidInputException iie = new InvalidInputException();
			System.out.println(iie.getMessage());
			
			iie.printStackTrace();
			throw iie;
		}
	}

//	public void operate() throws Exception {
//		try {
//			System.out.println("Connection3 established..,");
//			Scanner scan = new Scanner(System.in);
//			System.out.print("enter 2 numbers: ");
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			int c = a / b;
//			System.out.println(c);
//			scan.close();
//
//		} 
////		catch (Exception e) {
////			System.out.println("Issue arised in ATM and resolved in ATM");
////			throw e;
////		}
//
//		finally {
//			System.out.println("Connection3 Terminated");
//		}
//		
//	}

}
