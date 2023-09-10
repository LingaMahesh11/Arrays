package Practice_arrays;
import java.util.Scanner;
public class NameMixing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[1];
		
		System.out.println("Enter the first name : ");
		
		arr[0] = scan.next();
		
		String[] brr = new String[1];
		
		System.out.println("Enter the Second name : ");
		
		brr[0] = scan.next();
		
		//Array traversing
		
		//String crr[] = new String[1];
		
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0;j < brr.length;j++) {
				System.out.println(arr[i] + brr[j]);
			}
		}
		scan.close();
	}

}
