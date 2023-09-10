package Practice_arrays;
import java.util.Scanner;
public class GivenNumberIsInArrayOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int[] arr = new int[scan.nextInt()];
		
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Enter " + (i+1) + " Number :");
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the element to found : ");
		int ele = scan.nextInt();
		
		boolean mahi = isNumberPresentOrNot(arr,ele);
		if(mahi) {
			System.out.println("Yes the " + ele + " is founded");
		}
		else {
			System.out.println("No " + ele + " is not founded");
		}
		scan.close();
	}
	
	static boolean isNumberPresentOrNot(int[] arr,int ele) {
		for (int i = 0;i < arr.length;i++) {
			if(arr[i] == ele) {
				return true;
			}
		}
		return false;
	}

}
