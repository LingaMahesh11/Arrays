package com.kn.arrays;

import java.util.Scanner;

public class CountEvenAndOddElementsInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// Array Decleration and Creation
		System.out.println("Enter the size of array : ");
		int[] arr = new int[scan.nextInt()];
		
		//Array intilization
		for (int i = 0; i < arr.length;i++) {
			System.out.println("Enter the " + (i+1) + " Element");
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		CountEvenAndOddElementsInAnArray result = new CountEvenAndOddElementsInAnArray();
		result.countEvenAndOddElementsInAnArray(arr);
	}

}
