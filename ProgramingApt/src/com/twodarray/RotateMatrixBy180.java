package com.twodarray;

public class RotateMatrixBy180 {
	public static void rotateMatrix(int x[][]) {
		int len=x.length-1;
		for (int i = 0; i <=(len)/2; i++) {
			for (int j = i; j <len-i; j++) {
				int temp=x[i][j];
				x[i][j]=x[len-j][i];
				x[len-j][i]=x[len-i][len-j];
				x[len-i][len-j]=x[j][len-i];
				x[j][len-i]=temp;
				
			}	
		}
		for (int i = 0; i <=(len)/2; i++) {
			for (int j = i; j <len-i; j++) {
				int temp=x[i][j];
				x[i][j]=x[len-j][i];
				x[len-j][i]=x[len-i][len-j];
				x[len-i][len-j]=x[j][len-i];
				x[j][len-i]=temp;
				
			}	
		}
		for (int i = 0; i < x.length; i++) {
			for(int j=0; j<x[i].length; j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		rotateMatrix(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
	}
}
