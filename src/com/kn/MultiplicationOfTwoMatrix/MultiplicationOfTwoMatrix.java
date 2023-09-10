package com.kn.MultiplicationOfTwoMatrix;

public class MultiplicationOfTwoMatrix {
	public int[][] mulipicationOfMatrix(int[][] arr,int[][] brr){
		int[][] crr = new int[arr.length][arr.length];
		
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				crr[i][j] =0;
				for(int k=0;k<crr[i].length;k++) {
					crr[i][j] = crr[i][j] + arr[i][k]*brr[k][j];
				}
			}
		}
		
		return crr;
	}
}
