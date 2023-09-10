package com.kn.arrays;

public class CountEvenAndOddElementsInAnArray {
	public void countEvenAndOddElementsInAnArray(int[] arr) {
		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < arr.length;i++) {
			if(arr[i]%2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("The total EVEN numbers are " + evenCount);
		System.out.println("The total ODD numbers are " + oddCount);
	}
}
