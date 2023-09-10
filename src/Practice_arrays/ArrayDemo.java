package Practice_arrays;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		array();
	}
	static void array() {
		//Array decleration
		int[] arr;
		
		//Array creation
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size ");
		int size = scan.nextInt();
		arr = new int[size];
		
		//Array intialization
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Enter the number for " + i + " " +"Element");
			arr[i] = scan.nextInt();
		}
		
		//Array Traversing
		for (int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("backward array is");
		
		for (int i = (size-1);i>= 0;i--) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
