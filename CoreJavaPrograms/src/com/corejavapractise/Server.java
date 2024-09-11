package com.corejavapractise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {

//		one-way communication
//		// 1. create server socket...
//
//		ServerSocket ss = new ServerSocket(4001);
//
//		System.out.println("server is ready...");
//
//		// 3. Accepted the request and created the socket
//		Socket s = ss.accept();
//		System.out.println("Request accepted");
//
//		// 5. create input stream and data input stream
//		InputStream is = s.getInputStream();
//		DataInputStream dis = new DataInputStream(is);
//		
//		//7. Receiving the data
//		String msg = dis.readUTF();
//		System.out.println(msg);

//		// Two-way communication but a single message....
//
//		// 1. create server socket...
//		ServerSocket ss = new ServerSocket(4002);
//		System.out.println("server is ready...");
//
//		// 3. Accepted the request and created the socket
//		Socket s = ss.accept();
//		System.out.println("Request accepted");
//
//		// 5. create input stream and data input stream
//		InputStream is = s.getInputStream();
//		DataInputStream dis = new DataInputStream(is);
//
//		// 7. Receiving the data
//		String msg = dis.readUTF();
//		System.out.print("Received message is: " + msg);
//		System.out.println();
//
//		// 9. create output stream and data output stream & Send the data
//		OutputStream os = s.getOutputStream();
//		DataOutputStream dos = new DataOutputStream(os);
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a message: ");
//		msg = scan.nextLine();
//		System.out.print("Sending message is: " + msg);
//		dos.writeUTF(msg);

		// Two-way communication with multiple message....

		// 1.create server socket
		ServerSocket ss = new ServerSocket(4003);
		System.out.println("Server is Ready...");

		// 3.accept the request and create socket
		Socket s = ss.accept();
		System.out.println("Request is accepted....");

		// 5. create Input/output stream and data output/input stream
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		// 7.send and receive a request by infinite times

		for (;;) {

			// Receiving the data
			System.out.print("Received data is: " + dis.readUTF());
			System.out.println();

			// sending a data to server
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a message: ");
			String msg = scan.nextLine();
			System.out.print("Sending data is: " + msg + "\n");
			dos.writeUTF(msg);

		}
	}

}
