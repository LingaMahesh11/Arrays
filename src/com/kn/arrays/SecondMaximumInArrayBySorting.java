package com.kn.arrays;

import java.util.Scanner;

public class SecondMaximumInArrayBySorting {

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
		
		System.out.print("Enter the which largest number you need to check ");
		int k = scan.nextInt();
		
		for (int i = 0; i < arr.length;i++) {
			for(int j = 0;j < arr.length-1-i; j++) {
				int temp = 0;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		
		System.out.println("The second largest number is "+arr[arr.length-k]);
		scan.close();
	}

}
