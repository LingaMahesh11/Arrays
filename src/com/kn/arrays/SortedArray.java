package com.kn.arrays;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the array size :");
		int[] arr = new int[scan.nextInt()];
		
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Enter the " + (i+1) + " number in the array");
			arr[i] = scan.nextInt();
		}
		int temp = 0;
		for (int i = 0;i <arr.length;i++) {
			for (int j = i;j < arr.length;j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The sorted array is : ");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}

}
