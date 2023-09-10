package Practice_arrays;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students :");
		int size1 = scan.nextInt();
		System.out.println("Enter number of subjects :");
		int size2 = scan.nextInt();
		int[][] arr = new int[size1][size2];
		
		
		
		for(int i = 0;i < size1;i++) {
			System.out.println("Enter Student " + (i+1) + " Data :");
			for (int j = 0;j < size2; j++) {
				System.out.println("Enter Subject " + (j+1) + " Marks =");
				arr[i][j] = scan.nextInt();
			}
		}

		for (int i = 0;i < arr.length;i++) {
			System.out.println("Student " + (i+1) + " Data :");
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print("Subject " + (j+1) + " Marks = ");
				System.out.println(arr[i][j]);
			}
			
		}
		scan.close();
	}

}
