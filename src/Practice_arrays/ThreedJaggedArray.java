package Practice_arrays;

import java.util.Scanner;

public class ThreedJaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an base : ");
		int base = scan.nextInt();
		System.out.println("Enter the size of an array1 : ");
		int arr1 = scan.nextInt();
		System.out.println("Enter the size of an array2 : ");
		int arr2 = scan.nextInt();
		int[][][] arr = new int[base][arr1][arr2];
		
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Enter value for i " + (i+1));
			for (int j = 0; j < arr[i].length;j++) {
				System.out.println("Enter value for j " + (j+1));
				for (int k = 0; k < arr[i][j].length;k++) {
					System.out.println("Enter value for k " + (k+1));
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		scan.close();
		
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0; j < arr[i].length;j++) {
				for (int k = 0; k < arr[i][j].length;k++) {
					System.out.print(arr[i][j][k] + " ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
