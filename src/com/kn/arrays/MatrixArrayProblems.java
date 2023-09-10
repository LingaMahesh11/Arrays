package com.kn.arrays;

import java.util.Scanner;

public class MatrixArrayProblems {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int[][] arr = new int[scan.nextInt()][];


		for(int i = 0; i < arr.length;i++) {
			System.out.println("Enter the " + (i+1) + "st array size");
			arr[i] = new int[scan.nextInt()];
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter the " + (i+1) + "st Elements");
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The principle array elements are : ");
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				if(i == j) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("The Secondary diagonal elements are :");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				if(j == 2-i) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("Printing the values in the 2nd row and 3rd coloumn ");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				if(i == 1) {
					System.out.print(arr[i][j] + " ");
				}
				if(j == 2) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.println("The square of sum of prime numbers present in the given matrix is :");
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				int count = 0;
				for(int k = 1; k <= arr[i][j];k++) {
					if(arr[i][j] % k == 0) {
						count++;
					}
				}
				if(count == 2) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println(sum*sum);
	}

}
