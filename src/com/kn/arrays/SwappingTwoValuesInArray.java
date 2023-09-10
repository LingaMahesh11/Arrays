package com.kn.arrays;

import java.util.Scanner;

public class SwappingTwoValuesInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] arr = new int[scan.nextInt()];
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int a = 2;
		int b = 4;
		int[] brr = new int[arr.length];
		for(int i = 0;i < arr.length;i++) {
			if(i==a) {
				brr[i] = arr[b];
			}
			else if(i==b) {
				brr[i] = arr[a];
			}
			else {
				brr[i] = arr[i];
			}
		}
		System.out.println("******************************");
		for(int i = 0; i <arr.length;i++) {
			System.out.print(brr[i] + " ");
		}
	}

}
