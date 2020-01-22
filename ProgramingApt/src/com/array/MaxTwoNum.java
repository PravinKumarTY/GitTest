package com.array;

import java.util.Scanner;

public class MaxTwoNum 
{
	public static void maxTwo(int x[])
	{
		int max1=x[0],pos1=0;
		int max2=x[1],pos2=1;
		for (int i = 0; i < x.length; i++)
		{
			if(max1<x[i])
			{
				max2=max1;
				pos2=pos1;
				max1=x[i];
				pos1=i;
			}
			else if(max2<x[i])
			{
			    max2=x[i];
			    pos2=i;		
			}
		}
		System.out.println("First Max Element "+max1+ "and its position ="+pos1);
		System.out.println("Second Max Element "+max2+ "and its position ="+pos2);
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
	       for (int i = 0; i < arr.length; i++)
	       {
			   System.out.print("\t"+arr[i]);
		   }
	       System.out.println();
	       maxTwo(arr);
	}

}
