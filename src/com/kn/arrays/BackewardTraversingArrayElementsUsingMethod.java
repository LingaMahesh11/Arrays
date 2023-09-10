package com.kn.arrays;
import java.util.Scanner;
public class BackewardTraversingArrayElementsUsingMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// Array decleration and creation
		System.out.println("Enter the size : ");
		int[] arr = new int[scan.nextInt()];
		
		//Array intilization
		for(int i = 0;i < arr.length;i++) {
			System.out.println("Enter " + (i+1) + " Element");
			arr[i] = scan.nextInt();
		}
		
		//Array Traversing
		
		int[] crr = backwardArray(arr);
		System.out.println("The backward Array is ");
		for (int i = (arr.length-1);i >= 0;i--) {
			System.out.println(crr[i]);
		}
		scan.close();
		
	}
	
	static int[] backwardArray(int[] arr) {
		int[] brr = new int[arr.length];
		for(int i = 0;i < arr.length;i++) {
			brr[i] = arr[i];
		}
		return brr;
	}

}
