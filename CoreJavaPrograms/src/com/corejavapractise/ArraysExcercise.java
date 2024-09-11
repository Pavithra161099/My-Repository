package com.corejavapractise;

import java.util.Scanner;

public class ArraysExcercise {

	public static void main(String[] args) {

//		int a[]= new int[10];
//		a[1]=10;
//		a[2]=20;
//		a[3]=30;
//		a[4]=40;
//		a[5]=50;
//		a[6]=60;
//		a[8]=80;
//		a[9]=90;
//		System.out.println(a[7]);  //-> will return 0
//		System.out.println(a[8]);   //-> will return 80
//		
//		//a[10]=100;
//		//System.out.println(a[10]);// will throw array index out of bounds exception

//		// take input from user and Store 5 students marks in array...
//
//		Scanner scan = new Scanner(System.in);
//
//		int arr[] = new int[5];
//		
//		for(int i=0; i<=arr.length-1; i++) {
//			System.out.print("Enter marks of student "+i +" is: ");
//			arr[i]= scan.nextInt();
//		}
//		
//		System.out.println("Array contents are...");
//		for(int i=0; i<=arr.length-1; i++) {
//			System.out.print(arr[i]+ " ");
//		}

//		// 2. Take the height of 10 basket ball players and store it in array
//
//		Scanner scan = new Scanner(System.in);
//
//		float arr[] = new float[10];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("Enter the height of player " + i + " is: ");
//			arr[i] = scan.nextFloat();
//		}
//
//		System.out.println("The players heights are...");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//		}
//
//		scan.close();
//		// 3. store employee characters(means initials) in an array
//
//		Scanner scan = new Scanner(System.in);
//
//		char arr[] = new char[5];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("Enter the Employee characters of " + i + " is: ");
//			arr[i] = scan.nextLine().charAt(0);
//		}
//
//		System.out.println("The Employee characters are...");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//		}
//
//		scan.close();

//		//One dimensional array....
//		
//		int arr[]=new int[10];
//		System.out.println(arr.length);

//		// Two dimensional array....
//		int arr[][] = new int[4][8];
//		System.out.println(arr.length);
//		System.out.println(arr[i].length);

//		// Three dimensional array....
//		int arr[][][] = new int[4][8][9];
//		System.out.println(arr.length);
//		System.out.println(arr[i].length);
//		System.out.println(arr[j].length);

		// 2d array
//		//1. Take the marks of the students as input from user and store it on array
//		Scanner scan = new Scanner(System.in);
//
//		int arr[][] = new int[4][4];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the mark of class " + i + " and student " + j + " is:");
//				arr[i][j] = scan.nextInt();
//			}
//		}
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("The students marks are: " + arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		scan.close();

//		// 2. Take the heights of the players as input from user and store it on array
//		Scanner scan = new Scanner(System.in);
//
//		float arr[][] = new float[4][5];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the height of game " + i + " and player " + j + " is:");
//				arr[i][j] = scan.nextFloat();
//			}
//		}
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("The heights of palyers is: " + arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		scan.close();

		// Jagged array....
//		Scanner scan = new Scanner(System.in);
//
//		int arr[][] = new int[4][];
//		arr[0]= new int[3];
//		arr[1]= new int[5];
//		arr[2]= new int[2];
//		arr[3]= new int[4];
//		
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the mark of class " + i + " and student " + j + " is:");
//				arr[i][j] = scan.nextInt();
//			}
//		}
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("The students marks are: " + arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		scan.close();

//		// 4. take the subject code as input which are characters from keyboard and
//		// store it an array.
//
//		Scanner scan = new Scanner(System.in);
//
//		int arr[][] = new int[3][];
//		arr[0] = new int[3];
//		arr[1] = new int[2];
//		arr[2] = new int[5];
//		
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the code of lecture " + i + " and subject " + j + " is:");
//				
//				arr[i][j] = scan.next().charAt(0);
//			}
//		}
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print( arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		scan.close();

		// take the input from user for branch and customers and store it an array.
//		Scanner scan = new Scanner(System.in);
//
//		String arr[][] = new String[4][];
//		arr[0] = new String[2];
//		arr[1] = new String[3];
//		arr[2] = new String[1];
//		arr[3] = new String[4];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the branch of " + i + " and customer " + j + " is:");
//				arr[i][j] = scan.next();
//			}
//		}
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		scan.close();

		// 3d array...
//		Scanner scan = new Scanner(System.in);
//
//		int arr[][][] = new int[3][2][3];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				for (int k = 0; k <= arr[i][j].length - 1; k++) {
//					System.out.print("Enter the marks of college " + i + " class " + j + " and student "+k +" is:");
//					arr[i][j][k] = scan.nextInt();
//				}
//			}
//		}
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				for (int k = 0; k <= arr[i][j].length - 1; k++) {
//					System.out.print(arr[i][j][k]+ " ");
//				}
//				System.out.println();
//			}
//			
//		}
//
//		scan.close();

//		//Jagged array in 3d 
//		Scanner scan = new Scanner(System.in);
//
//		int arr[][][] = new int[3][][];
//		arr[0] = new int [1][];
//		arr[1] = new int [2][];
//		arr[2] = new int [3][];
//		
//		arr[0][0]= new int[4];
//		arr[1][0]= new int[2];
//		arr[1][1]= new int[3];
//		arr[2][0]= new int[3];
//		arr[2][1]= new int[4];
//		arr[2][2]= new int[2];
//		
//		
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				for (int k = 0; k <= arr[i][j].length - 1; k++) {
//					System.out.print("Enter the marks of college " + i + " and class " + j + " and student "+k +" is:");
//					arr[i][j][k] = scan.nextInt();
//				}
//			}
//		}
//
//		System.out.println("Students marks are:");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				for (int k = 0; k <= arr[i][j].length - 1; k++) {
//					System.out.print(arr[i][j][k]+ " ");
//				}
//				System.out.println();
//			}
//			
//		}
//
//		scan.close();

		// take the length as an input from user and create a one dimensional array and
		// store the students
		// marks in an array and display it.

//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Enter the length of an array: ");
//		int len = scan.nextInt();
//		int arr[] = new int[len];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("Enter the marks of student " + i + " is: ");
//			arr[i] = scan.nextInt();
//		}
//
//		System.out.println(" The students marks are....");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.println(arr[i]);
//		}
//		scan.close();

//		// take rows and columns from user and create a matrix to store the ages of the
//		// students..
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Enter the length of row: ");
//		int row = scan.nextInt();
//		System.out.print("Enter the length of column: ");
//		int col = scan.nextInt();
//		int arr[][] = new int[row][col];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the age of student " + i + " and " + j + " is: ");
//				arr[i][j] = scan.nextInt();
//			}
//		}
//
//		System.out.println("The students ages are....");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		scan.close();

//		// 2d Jagged array- taking rows and columns for each rows as input from user and
//		// store the ages
//		// of students in its.
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Enter the length of row: ");
//		int row = scan.nextInt();
//
//		int arr[][] = new int[row][];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("How many columns of row "+ i+" is: ");
//			arr[i] = new int[scan.nextInt()];
//
//		}
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the age of student " + i + " and " + j + " is: ");
//				arr[i][j] = scan.nextInt();
//			}
//		}
//
//		System.out.println("The students ages are....");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		scan.close();

		// 3d-jagged array by taking the lengths of all he dimension of an array of
		// input from the user. store the marks of students in the created 3d-jagged
		// array.

//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("Enter the length of row: ");
//		int row = scan.nextInt();
//		int arr[][][] = new int[row][][];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("Enter the row length of 2nd array " + i + " is: ");
//			arr[i] = new int[scan.nextInt()][];
//		}
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the row length of 3rd array " + i + " and " + j + " is: ");
//				arr[i][j] = new int[scan.nextInt()];
//			}
//		}
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr.length - 1; j++) {
//				for (int k = 0; k <= arr[i][j].length - 1; k++) {
//
//					System.out.print("Enter the marks of students " + i + " " + j + " " + k + " is: ");
//					arr[i][j][k] = scan.nextInt();
//
//				}
//			}
//			System.out.println();
//		}
//
//		System.out.println("The students marks are...");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr.length - 1; j++) {
//				for (int k = 0; k <= arr[i][j].length - 1; k++) {
//					System.out.print(arr[i][j][k] + " ");
//				}
//			}
//			System.out.println();
//		}
//
//		scan.close();

		// copy the contents of one array to another array

//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the lenght of an array: ");
//		int len = scan.nextInt();
//		int arr[] = new int[len];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print("Enter the elements of array: ");
//			arr[i] = scan.nextInt();
//		}
//
//		int arr2[] = new int[arr.length];
//		for (int i = 0; i <= arr.length - 1; i++) {
//			arr2[i] = arr[i];
//		}
//
//		System.out.print("Elements of array2 is : ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		scan.close();

//		//3rd excercise
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the lenght of an array: ");
//		int len = scan.nextInt();
//		int arr1[] = new int[len];
//
//		for (int i = 0; i <= arr1.length - 1; i++) {
//			System.out.print("Enter the elements of array: ");
//			arr1[i] = scan.nextInt();
//		}
//
//		int arr2[] = new int[arr1.length];
//		int j = arr2.length-1;
//		
//		for (int i = 0; i <= arr1.length - 1; i++) {
//			arr2[j] = arr1[i];
//			j--;
//		}
//
//		System.out.print("Elements of array2 is : ");
//		for (int i = 0; i <= arr1.length - 1; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		scan.close();

//		// copy the contents of one 2d array to another 2d array.
//
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the length of an array1 is: ");
//		int a1 = scan.nextInt();
//		System.out.print("Enter the lenght of an array2 is: ");
//		int a2 = scan.nextInt();
//		int arr[][] = new int[a1][a2];
//
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print("Enter the elements of arrays: ");
//				arr[i][j] = scan.nextInt();
//			}
//		}
//
//		int arr2[][] = new int[arr.length][arr.length];
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				arr2[i][j] = arr[i][j];
//			}
//		}
//
//		System.out.println("Elements of array2 is : ");
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = 0; j <= arr[i].length - 1; j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}
//		scan.close();

		// add contents of two arrays and stored the results in third array in reverse
		// direction
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the length of an array: ");
//		int len = scan.nextInt();
//		int arr1[] = new int[len];
//
//		for (int i = 0; i <= arr1.length - 1; i++) {
//			System.out.print("Enter the elements of array: ");
//			arr1[i] = scan.nextInt();
//		}
//
//		int arr2[] = new int[arr1.length];
//		for (int i = 0; i <= arr1.length - 1; i++) {
//			arr2[i] = arr1[i];
//		}
//
//		int arr3[] = new int[arr1.length];
//		int j = arr3.length - 1;
//		for (int i = 0; i <= arr1.length - 1; i++) {
//			arr3[j] = arr1[i] + arr2[i];
//			j--;
//		}
//
//		System.out.print("Sum of Elements is : ");
//		for (int i = 0; i <= arr1.length - 1; i++) {
//			System.out.print(arr3[i] + " ");
//		}
//		scan.close();

	}

}
