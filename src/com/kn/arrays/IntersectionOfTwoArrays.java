package com.kn.arrays;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		String[] arr = {"ONE","TWO","THREE","FOUR","FIVE"};
		
		String[] brr = {"THREE","FOUR","FIVE","SIX","SEVEN",};
		
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0; j < brr.length;j++) {
				if(arr[i] == brr[j]) {
					System.out.println(arr[i] + " ");
				}
			}
		}
	}

}
