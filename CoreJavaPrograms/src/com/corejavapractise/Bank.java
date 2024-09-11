package com.corejavapractise;

public class Bank {

	public void initiate()  {
		ATM atm = new ATM();
		try {
			atm.takeInput();
			Thread.sleep(5000);
			atm.verify();
		} catch (Exception e1) {
			try {
				atm.takeInput();
				atm.verify();
			} catch (Exception e2) {
				try {
					atm.takeInput();
					atm.verify();
				} catch (Exception e3) {

					System.out.println(
							"You attempted 3 times with invalid acc no/pwd.So we are blocking your card for next 24 hours");
				}
			}

		}
	}
//	public void initiate() throws Exception  {
//
//		try {
//			System.out.println("Connection2 established..,");
//			ATM atm = new ATM();
//			atm.operate();
//		}
////		catch (Exception e) {
////			System.out.println("Issue reached bank");
////		}
//		finally {
//			System.out.println("Connection2 Terminated.");
//		}
//	}

}