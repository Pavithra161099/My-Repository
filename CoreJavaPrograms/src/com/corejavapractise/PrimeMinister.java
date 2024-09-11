package com.corejavapractise;

public class PrimeMinister {

	static PrimeMinister pm = null;

	public static PrimeMinister factory() {

		if (pm == null) {
			pm = new PrimeMinister();
		}
		return pm;

	}
}
