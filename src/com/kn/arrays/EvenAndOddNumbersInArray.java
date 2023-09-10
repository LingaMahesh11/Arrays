package com.kn.arrays;

import java.util.Scanner;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Decleration and Creation
		System.out.println("Enter the size : ");
		int[] arr = new int[scan.nextInt()];
		
		//Array Intilization
		for(int i = 0; i < arr.length;i++) {
			System.out.println("Enter the " + (i+1) + " element");
			arr[i] = scan.nextInt();
		}
		
		//Array traversing
		array(arr);
		scan.close();
		
	}
	// Method to print an element in an array is Even or Odd
	static void array(int[] arr) {
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is a even number");
			}
			else {
				System.out.println(arr[i] + " is a Odd number");
			}
		}
	}
}
