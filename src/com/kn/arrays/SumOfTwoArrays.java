package com.kn.arrays;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//first Array Deceleration and Array Creation
		System.out.println("Enter first array size ");
		int[] arr = new int[scan.nextInt()];
		
		//first Array Intilization
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Eneter first arry " + (i+1) + "st element");
			arr[i] = scan.nextInt();
		}
		
		//Second array Deceleration and Creation
		System.out.println("Enter second array size ");
		int[] brr = new int[scan.nextInt()];
		
		//second Array Intilization
		for (int i = 0;i < brr.length;i++) {
			System.out.println("Eneter second array " + (i+1) + "st element");
			brr[i] = scan.nextInt();
		}
		
		int drr[] = sumOfTwoArrays(arr,brr);
		System.out.print("The sum of two arrays is ");
		for (int i = 0; i < drr.length;i++) {
			System.out.print(drr[i] + " ");
		}
		scan.close();
		
	}
	// Method to calculate to sum of two arrays
	static int[] sumOfTwoArrays(int[] arr,int[] brr) {
		int[] crr = new int[arr.length];
		for (int i = 0;i < crr.length;i++) {
			crr[i] = arr[i] + brr[i];
		}
		return crr;
	}

}
