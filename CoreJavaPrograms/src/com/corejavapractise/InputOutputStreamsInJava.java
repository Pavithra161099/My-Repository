package com.corejavapractise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputStreamsInJava {

	public static void main(String[] args) throws IOException {

		// using the FileInputStream and FileOutputStream classes to transfer the input
		// file data to output file
//		String filePath1 = "C://Users//r.pavithra//input.txt";
//		String filePath2 = "C://Users//r.pavithra//output.txt";
//		try {
//			FileInputStream fis = new FileInputStream(filePath1);
//			FileOutputStream fos = new FileOutputStream(filePath2);
//			int temp;
//
//			while ((temp = fis.read()) != -1) {
//				fos.write(temp);
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

//		// using the FileReader and FileWriter classes to transfer the input file data
//		// to output file
//		String filePath1 = "C://Users//r.pavithra//input.txt";
//		String filePath2 = "C://Users//r.pavithra//output.txt";
//		try {
//			FileReader fr = new FileReader(filePath1);
//			FileWriter fw = new FileWriter(filePath2);
//			int temp;
//
//			while ((temp = fr.read()) != -1) {
//				fw.write(temp);
//				fw.flush();
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

		// using the BufferReader and BufferWriter classes to transfer the input file
		// data to output file
//		String filePath1 = "C://Users//r.pavithra//input.txt";
//		String filePath2 = "C://Users//r.pavithra//output.txt";
//		try {
//			FileReader fr = new FileReader(filePath1);
//			FileWriter fw = new FileWriter(filePath2);
//			BufferedReader br = new BufferedReader(fr);
//			BufferedWriter bw = new BufferedWriter(fw);
//			String temp;
//
//			while ((temp = br.readLine()) != null) {
//				bw.write(temp);
//				bw.newLine();
//			}
//			bw.flush();
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

		// w.a.p to check whether the given path contains a file or folder....

		String filePath1 = "C://Users//r.pavithra//input.txt";
		File f = new File(filePath1);

		if (f.exists()) {
			if (f.isFile()) {
				System.out.println("It's a File");
			} else {
				System.out.println("It's a directory");
			}
		} else {
			System.out.println("Invalid path");
		}

		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getParent());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());
		System.out.println(f.getClass());
		System.out.println(f.getParentFile());
		System.out.println(f.length());
		System.err.println(f.canExecute());

	}

}
