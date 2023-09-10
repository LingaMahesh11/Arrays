package Practice_arrays;
import java.util.Scanner;
public class TwoDjaggedArrayFriends {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many batches ");
		int size = scan.nextInt();
		String[][]arr  = new String[size][];
		
		for(int i = 0;i < arr.length;i++) {
			System.out.println("Enter number of Friends You have in A" + (i+1) + " Batch");
			arr[i] = new String[scan.nextInt()];
		}
		
//		arr[0] = new String[2];
//		arr[1] = new String[3];
//		arr[2] = new String[2];
//		arr[3] = new String[4];
		
		for(int i = 0;i < arr.length;i++) {
			System.out.println("In A " + (i+1) + " Batch i have " + arr[i].length + " Friends");
			for (int j = 0;j < arr[i].length;j++) {
				System.out.print("Friend " + (j+1) + " Name is : ");
				arr[i][j] = scan.next();
			}
		}
		
		for (int i = 0;i < arr.length;i++) {
			System.out.println("Your A" + (i+1) + " Batch friends are ");
			for (int j = 0;j < arr[i].length;j++) {
				System.out.println("Friend " + (j+1) + " Name is ");
				System.out.println(arr[i][j]);
			}
		}
		scan.close();
	}

}
