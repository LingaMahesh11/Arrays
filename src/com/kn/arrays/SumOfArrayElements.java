package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//Array decleration and creation
		System.out.println("Enter the size : ");
		int[] arr = new int[scan.nextInt()];
		
		//Array intilization
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Enter the " + (i+1) + " element");
			arr[i] = scan.nextInt();
		}
		int result = sumOfArrayElements(arr);
		System.out.println("The sum of the Array Elements is " + result);
		scan.close();

	}
	// Method to calculate the sum of array element
	static int sumOfArrayElements(int[] arr) {
		int sum = 0;
		//Array Traversing
		for (int i = 0; i < arr.length;i++) {
			sum = sum + arr[i];
		}
		return(sum);
	}
}