package com.kn.mergingArrays;

public class MergingArrays {
	public int[] merging(int[] arr,int[] brr) {
		int[] crr = new int[arr.length+brr.length];
		int a=0;
		int b=0;
		for(int i=0;i<crr.length;i++) {
			if(i%2==0) {
				crr[i] = arr[a];
				a++;
			}
			else {
				crr[i] = brr[b];
				b++;
			}
		}
		return crr;
	}
}
