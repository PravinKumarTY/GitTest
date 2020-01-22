package com.array1;

import java.util.Scanner;

public class PrintGreaterLesserOrder {
	public static int[] sort(int ar[])
	{
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
    public static void printOrder(int a[])
    {
    	int[]ar=sort(a);
    	int mid=ar.length/2;
    	System.out.print(a[mid]+" ");
    	for (int i = 1; i <=mid; i++) {
			System.out.print(" "+a[mid-i]+" "+a[mid+i]);
		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		printOrder(arr);
	}
}
