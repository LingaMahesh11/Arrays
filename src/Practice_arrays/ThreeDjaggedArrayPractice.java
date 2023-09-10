package Practice_arrays;

import java.util.Scanner;

public class ThreeDjaggedArrayPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int[][][] arr = new int[scan.nextInt()][][];
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println("Enter the " + (i+1) +" Array size");
			arr[i] = new int [scan.nextInt()][];
		}
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j] = new int[scan.nextInt()];
			}
		}
		System.out.println("Insert the values : ");
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				for(int k = 0;k<arr[i][j].length;k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		System.out.println("The 3d array is : ");
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				for(int k = 0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		scan.close();
	}

}
