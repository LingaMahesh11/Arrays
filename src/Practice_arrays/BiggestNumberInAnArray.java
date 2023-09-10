package Practice_arrays;
import java.util.Scanner;
public class BiggestNumberInAnArray {

	public static void main(String[] args) {
		array();
	}
	static void array() {
		Scanner scan = new Scanner(System.in);
		int[] arr;
		System.out.println("enter array size ");
		arr = new int[scan.nextInt()];
		
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Enter Array number " + i);
			arr[i] = scan.nextInt();
		}
		
		int max = 0;
		for(int i = 0;i < arr.length;i++) {
			
	    	if (arr[i] > max) {
				max = arr[i];
			}
		}
		scan.close();
		System.out.println("Largest numbers in the given array is " + max);
	}
}
