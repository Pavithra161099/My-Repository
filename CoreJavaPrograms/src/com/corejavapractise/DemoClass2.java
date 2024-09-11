package com.corejavapractise;

import java.util.Scanner;

public class DemoClass2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string: ");
        String str = scan.nextLine();
        char replacement = 'A';

        String newStr = replaceCharacterAfterSpace(str, replacement);
        System.out.println(newStr); 
    }

    public static String replaceCharacterAfterSpace(String str, char replacement) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == ' ') {
                sb.setCharAt(i + 1, replacement);
            }
        }

        return sb.toString();
    }

}
