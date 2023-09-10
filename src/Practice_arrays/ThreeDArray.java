package Practice_arrays;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Decleration
		int[][][] arr;
		
		//Array creation
		arr = new int[2][2][2];
		
		//Array Intilization
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0; j < arr[i].length;j++) {
				for (int k = 0; k < arr[i][j].length;k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		//Array Traversing
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0; j < arr[i].length;j++) {
				for (int k = 0; k < arr[i][j].length;k++) {
					System.out.println("Your Array is "+arr[i][j][k]);
				}
			}
		}
	}

}
