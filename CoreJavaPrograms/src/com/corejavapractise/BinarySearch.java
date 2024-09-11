package com.corejavapractise;

public class BinarySearch {

	public boolean binarySearch(int[] arr, int key) {

		int low, mid, high;
		low = 0;
		high = arr.length - 1;

		while(low<=high) {
			mid = (low + high) / 2;
			if (arr[mid] == key) {				
				return true;
			}else if(key>arr[mid]) {
				low= mid+1;
				high=high;
			}else {
				low=low;
				high=mid-1;
			}
		}
		return false;	

	}
}
