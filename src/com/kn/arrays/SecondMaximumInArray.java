package com.kn.arrays;

import java.util.Scanner;

public class SecondMaximumInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//Array Declearation and Creation
		System.out.println("Enter the size : ");
		int[] arr = new int[scan.nextInt()];
		
		//Array intilizatio
		for (int i = 0; i < arr.length;i++) {
			System.out.println("Enter " + (i+1) + " Element");
			arr[i] = scan.nextInt();
		}
		
		int largest = 0,secondLargest = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
//			if(secondLargest > arr[i] && arr[i] < largest) {
//				secondLargest = arr[i];
//			}
		}
		System.out.println("The second largest Number is " + secondLargest);
		scan.close();
	}

}
