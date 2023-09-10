package Practice_arrays;

import java.util.Scanner;

public class AddingRowsValuesIn2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[2][];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = new int[scan.nextInt()];
		}
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("The sum of rows is:");
		
		for(int i = 0; i<arr.length;i++) {
			int sum = 0;
			for(int j = 0; j<arr[i].length;j++) {
				sum = sum+arr[i][j];
			}
			System.out.println("The row " + (i+1) + " : " + sum);
		}
	}

}
