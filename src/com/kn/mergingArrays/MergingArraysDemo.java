package com.kn.mergingArrays;

import java.util.Scanner;

public class MergingArraysDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("First array size:");
		int[] arr = new int[scan.nextInt()];
		
		System.out.println("First array values:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Second array size:");
		int[] brr = new int[scan.nextInt()];
		
		System.out.println("Second array values:");
		
		for(int i=0;i<brr.length;i++) {
			brr[i] = scan.nextInt();
		}
		
		MergingArrays result = new MergingArrays();
		
		int[] drr = result.merging(arr, brr);
		
		System.out.println("The merged array is : ");
		for(int i=0;i<drr.length;i++) {
			System.out.print(drr[i] + " ");
		}
		scan.close();
	}

}
