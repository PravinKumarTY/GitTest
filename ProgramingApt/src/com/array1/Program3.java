package com.array1;

import java.util.Scanner;

public class Program3 {
	public static void firstMax(int[] ar)
	{
		int max=ar[0];
		int pos=0;
		for (int i = 1; i < ar.length; i++) {
			if(max<ar[i])
			{
				max=ar[i];
				pos=i;
			}
		}
		System.out.println("The Max element is="+max);
		System.out.println("The max element position="+pos);
	}
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the size of array:");
	      int size=sc.nextInt();
	      //Declaring the array
	      int a[]=new int[size];
	      System.out.println("Enter array elements:");
	      for (int i = 0; i <size; i++) {
	    	  System.out.println("Enter element at"+i+"position");
			  a[i]=sc.nextInt();
		  }
	      firstMax(a);
	}

}
