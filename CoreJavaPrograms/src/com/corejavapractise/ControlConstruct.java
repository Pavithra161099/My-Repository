package com.corejavapractise;

public class ControlConstruct {

	public static void main(String[] args) {

		// if, if-else, if-else ladder, switch
//		int a = 10;
//		int b = 30;
//		int c = 30;
		// 1.if
//		if(a<b) {
//			System.out.println("a is greater");
//		}

		// 2. if-else
//		if(a>b) {
//			System.out.println("a is greater");
//		}else {
//			System.out.println("b is greater");
//		}

		// 3.if-else ladder
//		if(a>b && a>c) {
//			System.out.println("a is greater");
//		}else if (b>a && b>c){
//			System.out.println("b is greater");
//		}else {
//			System.out.println("c is greater");
//		}

		// 4.switch
//		int month = 4;
//		switch(month) {
//		case 1: System.out.println("Jan");
//		break;
//		case 2: System.out.println("Feb");
//		break;
//		case 3: System.out.println("Mar");
//		break;
//		case 4: System.out.println("Apr");
//		break;
//		case 5: System.out.println("May");
//		break;
//		case 6: System.out.println("Jun");
//		break;
//		case 7: System.out.println("Jul");
//		break;
//		case 8: System.out.println("Aug");
//		break;
//		case 9: System.out.println("Sep");
//		break;
//		case 10: System.out.println("Oct");
//		break;
//		case 11: System.out.println("Nov");
//		break;
//		case 12: System.out.println("Dec");
//		break;
//		default: System.out.println("invalid month");
//		break;
//		}

		// only _ and $ specials symbols are permitted in java's variables

//		int temp=10;
//		int _temp= 20;
//		int temp_ =80;
//		int $temp =40;
//		int temp$ =50;
//		System.out.println(temp);
//		System.out.println(_temp);
//		System.out.println(temp_);
//		System.out.println($temp);
//		System.out.println(temp$);

		// int literals

//		int x = 45;
//		int y = 045;
//		int z = 0X45;
//		int d = 0b11001100;
//
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println(d);

//		int a = 10;
//		int b = 1_0;
//		int c = 1____0;
		// int d= _10;
		// int e= 10_;
		// int f= _0X45;
		// int g= 0_X45;
		// int h= 0X_45;
		// int i=3.147f_;
		// int j=3.147_f;
		// int k=_3.147f;
		// int l=3._147f;
		// int l=3_.147f;
		//int d=3.1_47f;
		//int e= 3.14_7f;
		//int f= 3_.146f;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		int a=5;
		int b=10;
		int c=20;
		int d= ++a + b-- + c++ - --c;
		System.out.println(d);
		b = a++ -c++ + b--;
		System.out.println(b);
		a=--b;
		System.out.println(a);
		
		

	}

}
