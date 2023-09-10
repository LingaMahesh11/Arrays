package com.kn.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array size : ");
		int[] arr = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the " + (i + 1) + " Element ");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the number to check ");
		int ele = scan.nextInt();
		scan.close();
		binarySearch(arr, ele);
	}

	static void binarySearch(int[] arr, int ele) {
		int low = 0;
		int high = arr.length - 1;
		boolean isFound = false;
		int position = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == ele) {
				isFound = true;
				position = mid + 1;
				break;
			} else if (ele > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (isFound == true) {
			System.out.println("Element " + ele + " is found at " + position + "th position");
		} else {
			System.out.println("Element " + ele + " is not found");
		}
	}
}