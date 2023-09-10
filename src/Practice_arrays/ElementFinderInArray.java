package Practice_arrays;

import java.util.Scanner;

public class ElementFinderInArray {

	public static void main(String[] args) {
		array();
	}

	static void array() {
		Scanner scan = new Scanner(System.in);

		// Array Decleration
		int[] arr;

		// Array creation
		System.out.println("Enter the size ");
		int size = scan.nextInt();
		arr = new int[size];

		// Array intilization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " " + "Number");
			arr[i] = scan.nextInt();
		}

		// Array Tranversing
		System.out.println("Enter the index number ");
		int index = scan.nextInt();

		System.out.print("The value for the index you entered is ");
		for (int i = 0; i < arr.length; i++) {
			if (index == i) {
				System.out.println(arr[i]);
			}
		}
		scan.close();
	}

}
