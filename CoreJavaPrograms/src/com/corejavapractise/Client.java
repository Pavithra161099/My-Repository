package com.corejavapractise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {

//		one-way communication
//		// 2.create socket and send request
//		Socket s = new Socket("127.0.0.1", 4001);
//		System.out.println("Sending request to server");
//
//		// 4. create output stream and data output stream
//		OutputStream os = s.getOutputStream();
//		DataOutputStream dos = new DataOutputStream(os);
//
//		//6. sending the data
//		String msg = "Hello World!";
//		dos.writeUTF(msg);

//		// Two-way communication but a single message
//		// 2.create socket and send request
//		Socket s = new Socket("127.0.0.1", 4002);
//		System.out.println("Sending request to server");
//
//		// 4. create output stream and data output stream
//		OutputStream os = s.getOutputStream();
//		DataOutputStream dos = new DataOutputStream(os);
//
//		// 6. sending the data
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a message: ");
//		String msg = scan.nextLine();
//		System.out.print("Sending message is: " + msg);
//		System.out.println();
//		dos.writeUTF(msg);
//
//		// 8. create input stream and data input stream & Receiving the data
//		InputStream is = s.getInputStream();
//		DataInputStream dis = new DataInputStream(is);
//		msg = dis.readUTF();
//		System.out.print("Received message is: " + msg);

		// Two-way communication with multiple message....

		// 2. create socket and send request to server
		Socket s = new Socket("127.0.0.1", 4003);
		System.out.println("Sending request to server");

		// 4. create Input/output stream and data output/input stream
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		// 6.send and receive a request by infinite times

		for (;;) {
			// sending a data to server
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a message: ");
			String msg = scan.nextLine();
			System.out.print("Sending data is: " + msg + "\n");
			dos.writeUTF(msg);

			// Receiving the data
			System.out.print("Received data is: " + dis.readUTF());
			System.out.println();

		}

	}

}
