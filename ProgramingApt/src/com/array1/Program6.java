package com.array1;

import java.util.Scanner;

public class Program6 {
	public static void evenOddSum(int x[])
	{
		int sumEven=0;
		int sumOdd=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]%2==0)
			{
				sumEven=sumEven+x[i];
			}
			else {
				sumOdd=sumOdd+x[i];
			}
		}
		System.out.println("Sum of Even Numbers="+sumEven);
		System.out.println("Sum of Odd Numbers="+sumOdd);
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
	      evenOddSum(a);
	}

}
