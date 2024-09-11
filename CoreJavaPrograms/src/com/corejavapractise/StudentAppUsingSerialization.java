package com.corejavapractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentAppUsingSerialization {

	public static void main(String[] args) throws Exception {

		// Serialization uses the below code...
//		StudentClassAppUsingSerialization s = new StudentClassAppUsingSerialization("Raj", 20, 100);
//		s.diplay();
//		String filePath1 = "C://Users//r.pavithra//input.txt";
//		FileOutputStream fos = new FileOutputStream(filePath1);
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(s);

		// DeSerialization uses the below code...
		String filePath1 = "C://Users//r.pavithra//input.txt";
		FileInputStream fis = new FileInputStream(filePath1);
		ObjectInputStream ois = new ObjectInputStream(fis);

		StudentClassAppUsingSerialization sde = (StudentClassAppUsingSerialization) ois.readObject();
		sde.diplay();

	}

}
