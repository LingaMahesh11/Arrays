package com.kn.arrays;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Decleration and creation
		System.out.println("Enter the size of the array : ");
		int[] arr = new int[scan.nextInt()];

		// Array Intilization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " Element");
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			//int count = 0;
			for (int j = 0; j < arr.length - 1-i; j++) {
				int temp = 0;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					//count = 1;
				}
			}
//			if (count == 1) {
//				break;
//			}
		}
		System.out.println("Sorted array is ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}