package Practice_arrays;
import java.util.Scanner;
public class ArrayNumbersDivisibleBy_5 {

	public static void main(String[] args) {
		array();
	}
	static void array() {
		// Array Decleration
		int[] arr;
		
		// Array Creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array ");
		arr = new int[scan.nextInt()];
		
		// Array intilization
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Enter " + i + " " + "Element");
			arr[i] = scan.nextInt();
		}
		
		// Array Transversing
		System.out.print("The even numbers are ");
		for (int i = 0; i < arr.length;i++) {
			if (arr[i]%5 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		scan.close();
	}

}
