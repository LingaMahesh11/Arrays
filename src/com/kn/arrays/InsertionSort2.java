package com.kn.arrays;

public class InsertionSort2 {

	public static void main(String[] args) {
		
		int[] arr = {112,48,72,39,14,131,92,17,6,44,37,73,9};
		
		for(int i = 0; i < arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
