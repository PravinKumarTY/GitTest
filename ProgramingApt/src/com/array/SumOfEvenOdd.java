package com.array;

import java.util.Scanner;

public class SumOfEvenOdd 
{
	public static void sumEvenOdd(int x[])
	{
		int sumEve=0,sumOdd=0;
		for (int i = 0; i < x.length; i++)
		{
			if(x[i]%2==0)
			{
				sumEve+=x[i];
			}
			else
			{
				sumOdd+=x[i];
			}
		}
		System.out.println("Sum Of Even Elements:"+sumEve);
		System.out.println("Sum Of Odd Elements:"+sumOdd);
	}
	public static void main(String[] args)
	{
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the size of array");
	       int size=sc.nextInt();
	       int arr[]=new int[size];
	       for (int i = 0; i < arr.length; i++) 
	       {
			  System.out.println("Enter["+i+"] Element");
			  arr[i]=sc.nextInt();
		   }
	       System.out.println("Array Elements Are:-");
	       for (int i = 0; i < arr.length; i++)
	       {
			  System.out.print("\t"+arr[i]);
		   }
	       System.out.println();
	       sumEvenOdd(arr);
	}
}
