package com.corejavapractise;

public class TeacherApp {

	public static void main(String[] args) {

		PhysicsTeacher pt = new PhysicsTeacher();
		ChemistryTeacher ct = new ChemistryTeacher();

		AcceptTeacher ta = new AcceptTeacher();
		ta.acceptTeacher(pt);
		ta.acceptTeacher(ct);

	}

}
