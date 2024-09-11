package com.corejavapractise;

public class SearchCharacter {

	int check(String str, char cha) {

		char arr[] = str.toCharArray();
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == cha) {
				return i;
			}
		}
		return -1;

	}
}
