package com.corejavapractise;

import java.util.Comparator;

public class Helper implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (((Emp) o1).age > ((Emp) o2).age) {
			return 1;
		}
		return -1;
	}
}
