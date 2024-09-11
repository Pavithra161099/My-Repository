package com.corejavapractise;

public class BubbleSort {

	public void bubbleSort(int[] arr) {
		int help;

		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					help = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = help;
				}
			}

		}
		
	}
	
	public boolean binarySearch(int[] arr, int key) {

		int low, mid, high;
		low = arr[0];
		high = arr.length - 1;

		while(low<=high) {
			mid = (low + high) / 2;
			if (key ==arr[mid]) {				
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
