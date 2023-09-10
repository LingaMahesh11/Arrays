package com.kn.arrays;

import java.util.Scanner;

public class SelectionSortDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int[] arr = new int[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " Element");
			arr[i] = scan.nextInt();
		}

		System.out.println("The sorted array is : ");

		SelectionSort result = new SelectionSort();
		int[] brr = result.sort(arr);
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		scan.close();
	}

}
