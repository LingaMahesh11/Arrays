package com.kn.arrays;

public class FindDuplicateValuesInGivenArray {

	public static void main(String[] args) {
		int[] arr = {1,3,3,4,4,5,5};
		
		
		System.out.print("The duplicate elements in the given array are ");
		for(int i = 0; i < arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
