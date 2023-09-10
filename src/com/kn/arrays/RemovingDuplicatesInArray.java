package com.kn.arrays;

import java.util.Scanner;

public class RemovingDuplicatesInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int[] arr = new int[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " Element");
			arr[i] = scan.nextInt();
		}


		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp = 0;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		removingDuplicatesInArray(arr);
		
		
		scan.close();

	}

	static void removingDuplicatesInArray(int[] arr) {
		//int count = arr.length;
		int j = 0;
		int[] brr = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				brr[j++] = arr[i];
			}
		}
		brr[j++] = arr[arr.length - 1];
		System.out.println("The final array is ");
		for (int i = 0; i < j; i++) {
			System.out.println(brr[i] + " ");
		}
		
	}
}