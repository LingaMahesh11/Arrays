package com.kn.arrays;

import java.util.Scanner;

public class FindingElementPositionInAnArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Decleration and Creation
		System.out.println("Enter the size of array : ");
		int[] arr = new int[scan.nextInt()];

		// Array intilization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter first " + (i + 1) + " element");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the elment : ");
		int ele = scan.nextInt();
		
		int result = findNumberPositionInArray(arr,ele);
		
	}

	// Method to check weather the number is present or not in the array
	public static int findNumberPositionInArray(int[] arr, int ele) {
		boolean isFound = false;
		int position = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				isFound = true;
				return ++i;
			}
		}
		if(isFound) {
			return position;
		}
		else {
			return -1;
		}
	}
}
