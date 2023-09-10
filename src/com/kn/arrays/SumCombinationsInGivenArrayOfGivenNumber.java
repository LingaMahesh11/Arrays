package com.kn.arrays;

import java.util.Scanner;

public class SumCombinationsInGivenArrayOfGivenNumber {

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
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		sumCombinationsInGivenArrayOfGivenNumber(arr,num);
		scan.close();
	}
	
	static void sumCombinationsInGivenArrayOfGivenNumber(int[] arr,int num) {
		//int count = 0;
		int low = 0;
		int high = arr.length-1;
		
		while(low <high) {
			if (arr[low] + arr[high] > num) {
				high--;
			}
			else if(arr[low] + arr[high] < num) {
				low++;
			}
			else if(arr[low] + arr[high] == num) {
				System.out.println("( " + arr[low] + " , " + arr[high] + " )");
				low++;
				high--;
			}
		}
	}

}
