package com.corejavapractise;

public class ChemistryTeacher extends Teacher {

//	public void teach() {
//		System.out.println("Chemistry teacher is Teaching chemistry");
//	}
//
//	public void doExp() {
//		System.out.println("Chemistry teacher is doing chemical experiment");
//	}

	@Override
	public void takeAttendance() {
		System.out.println("Chemistry teacher is taking attendance after lunch");
		
	}

	@Override
	public void teach() {
		System.out.println("Chemistry teacher is Teaching chemistry");
		
	}
}
