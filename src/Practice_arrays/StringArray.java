package Practice_arrays;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = scan.nextInt();
		String[] arr = new String[size];
		
		System.out.println("Enter the words : ");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = scan.next();
		}
		System.out.println("The string array is :");
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		scan.close();
	}

}
