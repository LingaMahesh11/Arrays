package com.kn.arrays;

public class SelectionSort1 {

	public static void main(String[] args) {
		int[] arr = {48,32,16,29,72,44,63};
		
		for(int i = 0; i < arr.length;i++) {
			int min = arr[i];
			int index = i;
			for (int j = i+1; j < arr.length;j++) {
				if(arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}

			int temp = arr[i];
			arr[i] = min;//or arr[index]
			arr[index] = temp;
			
		}
		System.out.println("Sorted array is : ");
		
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}