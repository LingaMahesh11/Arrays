package Practice_arrays;

public class Array_Practice {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[5][5];
		for (int i = 0;i < arr.length;i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 10);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}