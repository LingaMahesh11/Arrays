package com.kn.SumOfTwo2DArrays;

public class SumOfTwo2DArrays {
	public int[][] sumOfMatrixs(int[][] arr,int[][] brr){
		
		int[][] crr = new int[3][3];
		
		for(int i=0; i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}
		
		return crr;
	}
}
