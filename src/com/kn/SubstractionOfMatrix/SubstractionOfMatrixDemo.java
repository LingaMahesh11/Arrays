package com.kn.SubstractionOfMatrix;

import java.util.Scanner;


public class SubstractionOfMatrixDemo {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Size of the first Marix:");
		int[][] arr = new int[scan.nextInt()][];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[arr.length];
		}

		System.out.println("Enter the first matrix values: ");
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
				
			}
		}
		
		System.out.println("Size of the first Marix:");
		int[][] brr = new int[scan.nextInt()][];
		
		for(int i=0;i<brr.length;i++) {
			brr[i] = new int[arr.length];
		}
		
		System.out.println("Enter the second matrix values: ");
		
		for(int i=0; i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				brr[i][j] = scan.nextInt();
				
			}
		}
		
		System.out.println("The first matrix is : ");
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The second matrix is : ");
		for(int i=0; i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The sum of two matrices is ");
		SubstractionOfMatrix result = new SubstractionOfMatrix();
		
		int[][] drr = result.subOfMatrixs(arr, brr);
		
		for(int i=0; i<drr.length;i++) {
			for(int j=0;j<drr[i].length;j++) {
				System.out.print(drr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
