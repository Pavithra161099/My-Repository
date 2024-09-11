package com.corejavapractise;

public class StudentClass {

	int id;
	String name;
	int age;
	String gender;
	int mark;
	int sem;
	int phoneNo;
	String emailId;
	String CollegeName;
	
	public StudentClass(int id, String name, int age, String gender, int mark, int sem, int phoneNo, String emailId,
			String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mark = mark;
		this.sem = sem;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		CollegeName = collegeName;
	}

	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mark=" + mark
				+ ", sem=" + sem + ", phoneNo=" + phoneNo + ", emailId=" + emailId + ", CollegeName=" + CollegeName
				+ "]";
	}
	
	
	
}
