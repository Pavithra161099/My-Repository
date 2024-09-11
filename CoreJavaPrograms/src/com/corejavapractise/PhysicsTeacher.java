package com.corejavapractise;

public class PhysicsTeacher extends Teacher {

//	public void teach() {
//		System.out.println("Physics teacher is Teaching physics");
//	}
//
//	public void doExp() {
//		System.out.println("Physics teacher is doing physics experiment");
//	}

	@Override
	public void takeAttendance() {
		
		System.out.println("Physics teacher is taking attendance before lunch");
	}

	@Override
	public void teach() {
		System.out.println("Physics teacher is Teaching physics");

	}
}
