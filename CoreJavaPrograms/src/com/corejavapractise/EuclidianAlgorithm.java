package com.corejavapractise;

public class EuclidianAlgorithm {

	int findGcd(int m, int n) {

		while (n != 0) {
			int rem = m % n;
			m = n;
			n = rem;
		}
		int gcd = m;
		return gcd;

	}
}
