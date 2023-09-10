package Practice_arrays;

import java.util.Scanner;

public class ThreeDArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// Array Decleration and Creation
		int[][][] arr = new int[2][2][2];
		int[][][] brr = new int[2][2][2];
		
		// Array Intilization
		for (int i = 0; i < arr.length;i++) {
			System.out.println("Enter array " + (i+1) + " Elements");
			for (int j = 0;j < arr[i].length;j++) {
				//System.out.println("Enter array " + (i+1) + " Element " + (j+1));
				for (int k = 0; k < arr[i][j].length;k++){
					System.out.println("Enter array " + (j+1) + " Element " + (k+1));
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		for (int i = 0; i < brr.length;i++) {
			System.out.println("Enter array " + (i+1) + " Elements");
			for (int j = 0;j < brr[i].length;j++) {
				//System.out.println("Enter array " + (i+1) + " Element " + (j+1));
				for (int k = 0; k < brr[i][j].length;k++){
					System.out.println("Enter array " + (j+1) + " Element " + (k+1));
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		findSumOfthreeDArray(arr,brr);
		scan.close();
		
	}
	
	static void findSumOfthreeDArray(int[][][] arr, int[][][] brr) {
		int[][][] drr = new int[2][arr[0].length][arr[1].length];
		
		for (int i = 0;i < drr.length;i++) {
			for (int j = 0;j < drr[i].length;j++) {
				for (int k = 0;k < drr[i][j].length;k++) {
					drr[i][j][k] = arr[i][j][k] + brr[i][j][k];
				}
			}
		}
		System.out.println("The Sum is ");
		for (int i = 0;i < drr.length;i++) {
			for (int j = 0;j < drr[i].length;j++) {
				for (int k = 0;k < drr[i][j].length;k++) {
					System.out.println(drr[i][j][k]);
				}
			}
		}
	}

}
