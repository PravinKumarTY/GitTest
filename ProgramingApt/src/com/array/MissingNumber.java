package com.array;

import java.util.Scanner;

public class MissingNumber 
{
	public static void missingNumber(int x[])
	{
		System.out.println("Missing Numbers Are:");
		for(int i=0; i<x.length-1; i++)
		{
			for (int j = x[i]+1; j < x[i+1]; j++)
			{
				System.out.print(" "+j);
			}
		}
		
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
	       missingNumber(arr);
	}
}
