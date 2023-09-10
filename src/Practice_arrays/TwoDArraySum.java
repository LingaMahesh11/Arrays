package Practice_arrays;

import java.util.Scanner;

public class TwoDArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Array Deceleration and Creation
		
		int[][] arr = new int[2][5];
		
		int[][] brr = new int[arr.length][arr[0].length];
		
		//Array Intilization
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0;j < arr[i].length;j++) {
				System.out.println("Enter Array " + (i+1) + " Element " + (j+1));
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter Second Array Details ");
		for (int i = 0;i < brr.length;i++) {
			
			for (int j = 0;j < brr[i].length;j++) {
				System.out.println("Enter Array " + (i+1) + " Element " + (j+1));
				brr[i][j] = scan.nextInt();
			}
		}
		
		findSumOfTwoArrays(arr,brr);
		scan.close();

	}
	
	static void findSumOfTwoArrays(int[][] arr,int[][] brr) {
		int[][] crr = new int[arr.length][arr[0].length];
		
		System.out.println("The sum is : ");
		for (int i = 0;i < arr.length;i++) {
			System.out.println("The sum of Array " + (i+1) + " is");
			for (int j = 0;j < crr[i].length;j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
				System.out.println(crr[i][j]);
			}
		}
	}

}
