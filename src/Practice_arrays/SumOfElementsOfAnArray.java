package Practice_arrays;
import java.util.Scanner;
public class SumOfElementsOfAnArray {

	public static void main(String[] args) {
		array();	
	}
	static void array() {
		
		//Array Decleration
		int[] arr;
		
		//Array Creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");

		arr = new int[scan.nextInt()];
		
		//Array intilization
		for (int i = 0;i < arr.length ;i++) {
			System.out.println("Enter " + " " + (i+1) + " " + "Element");
			arr[i] = scan.nextInt();
		}
		
		//Array Traversing
		int sum = 0;
		for (int i = 0;i < arr.length;i++) {
			sum = sum + arr[i];
		}
		scan.close();
		System.out.println("The sum of the elements of an array is " + sum);
	}
	

}
