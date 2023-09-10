package com.kn.arrays;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// First Array Decleration and creation
		System.out.print("Enter the size of the first Array : ");
		int[] arr = new int[scan.nextInt()];

		// First array intilization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the first array " + (i + 1) + " Element :");
			arr[i] = scan.nextInt();
		}

		// Second Array Decleration and creation
		System.out.print("Enter the size of the Second Array : ");
		int[] brr = new int[scan.nextInt()];

		// Second array intilization
		for (int i = 0; i < brr.length; i++) {
			System.out.println("Enter the second array " + (i + 1) + " Element :");
			brr[i] = scan.nextInt();
		}
		int[] drr = mergeArrays(arr,brr);
		
		System.out.print("The newly merged array is ");
		for(int i = 0;i < drr.length;i++) {
			System.out.print(drr[i] + " ");
		}
		scan.close();
		
		
	}
	
	// Method to merge two arrays
	public static int[] mergeArrays(int[] arr,int[] brr) {
		
		// Array Traversing 
		
		int[] crr = new int[arr.length+brr.length];
		for(int i = 0;i < arr.length;i++) {
			crr[i] = arr[i];
		}
		int j = 0;
		for(int i = arr.length;i < crr.length;i++) {
			crr[i] = brr[j];
			j++;
		}
		
		return crr;
	}

}
