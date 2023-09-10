package Practice_arrays;

import java.util.Scanner;

public class TwoDJaggedArrayPractice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size ");
		int[][] arr = new int[scan.nextInt()][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + "  array size ");
			arr[i] = new int[scan.nextInt()];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + (i + 1) + " array elements");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("Your jagged array is :");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
