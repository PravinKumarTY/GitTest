package com.array1;

import java.util.Scanner;

public class Program13 {
    public static void findMaxInEachRow(int x[][])
    {
    	for (int i = 0; i < x.length; i++) {
			int max=x[i][0];
			for (int j =1; j < x[i].length; j++) {
				if(max<x[i][j])
				{
					max=x[i][j];
				}
			}
			System.out.println("Max:"+max);
		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row:");
		int row=sc.nextInt();
		System.out.println("Enter Column:");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr["+i+"]["+j+"] position");
				arr[i][j]=sc.nextInt();
			}
		}
        System.out.println("Matrix elements are:");
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
        findMaxInEachRow(arr);
	}

}
