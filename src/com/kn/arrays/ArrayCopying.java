package com.kn.arrays;

import java.util.Scanner;

public class ArrayCopying {

	public static void main(String[] args) {
		
		//Array Decleration and creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size : ");
		int[] arr = new int[scan.nextInt()];
		
		//Array intilization
		for (int i = 0;i < arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("****************************************************");
		int[] crr = array(arr);
		//Array Traversing
		for (int i = 0;i < crr.length;i++) {
			System.out.println(crr[i]);
		}
		scan.close();
	}

	static int[] array(int[] arr) {
		System.out.println("****************************************************");
		int[] brr = new int[arr.length];
		for (int i = arr.length; i > 0; i--) {
			brr[i] = arr[i];
			// System.out.println(brr[i]);
		}
		return brr;
	}

}
