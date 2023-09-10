package com.kn.arrays;

import java.util.Scanner;

public class MaxAndMinelement {
// write a java program to accept array from user and find maximum and minimum numbers
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Decleration and Creation
		
		int[] arr = new int[scan.nextInt()];
		
		// Array Intilization
		
		for (int i = 0; i < arr.length;i++) {
			System.out.println("Enter " +(i + 1) + " element");
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		for (int i = 0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		for (int i = 0; i < arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("The Maximum number is " + max);
		System.out.println("The Minimum number is " + min);
		
		scan.close();
	}
	

}
