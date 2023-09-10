package com.kn.mergingTwoArraysReverse;

public class MergingTwoArraysReverse {
	public int[] merging(int[] arr, int[] brr) {
		int[] crr = new int[arr.length + brr.length];
		int a = 0;
		int b = brr.length-1;
		for (int i = 0; i < crr.length; i++) {
			if (i % 2 == 0) {
				crr[i] = arr[a];
				a++;
			} 
			else {
				crr[i] = brr[b];
				b--;
			}
		}
		return crr;
	}
}
