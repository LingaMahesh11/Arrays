package Practice_arrays;

import java.util.Scanner;

public class SumAndProductOfTwoArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array decleration and creation
		System.out.println("Enter first array size ");
		int[] arr = new int[scan.nextInt()];

		// Array intilization

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+ (i+1) +  " number for array : ");
			arr[i] = scan.nextInt();
		}

		int[] brr = new int[arr.length];


		for (int i = 0; i < brr.length; i++) {
			System.out.println("Enter second array " + (i+1) + " number : ");
			arr[i] = scan.nextInt();
		}
		
		sumOfArray(arr,brr);
		productOfArray(arr,brr);
		scan.close();
	}
	
	static void sumOfArray(int[] arr,int[] brr) {
		System.out.println("The sum of two arrays is ");

		int[] crr = new int[arr.length];
		for (int i = 0;i < arr.length;i++) {
			crr[i] = arr[i] + brr[i];
			System.out.println(crr[i]);
		}
		
	}
	
	static void productOfArray(int[] arr,int[] brr) {
		System.out.println("The sum of two arrays is ");

		int[] crr = new int[arr.length];
		for (int i = 0;i < arr.length;i++) {
			crr[i] = arr[i] * brr[i];
			System.out.println(crr[i]);
		}
		
	}
	
}