package com.array;

import java.util.Scanner;

public class NthMaxNumber
{
	public static void  nthMax(int x[],int x1)
	{
		//1st sorting the array elements 
		for (int i = 0; i < x.length-1; i++)
		{
			for (int j =i+1; j < x.length; j++) 
			{
				if(x[i]>x[j])
				{
					int t=x[i];
					x[i]=x[j];
					x[j]=t;
				}
			}
		}
		for (int i = 0; i < x.length; i++)
		{
			System.out.print("\t"+x[i]);
		}
		System.out.println();
		//System.out.println(x1+"th Max Number="+x[x1]); for descending order sorting
		System.out.println(x1+"th max Number="+x[x.length-x1]);
		System.out.println(x1+"th min Number="+x[x1-1]);
	}
	public static void main(String[] args) 
	{
       // nthMax(new int[]{12,15,10,45,36},3);
       //System.out.println("Nth max");
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the size of array");
	       int size=sc.nextInt();
	       int arr[]=new int[size];
	       for (int i = 0; i < arr.length; i++) 
	       {
			  System.out.println("Enter["+i+"] Element");
			  arr[i]=sc.nextInt();
		   }
	       System.out.println("Enter Position for Max & Min:");
	       int posi=sc.nextInt();
	       nthMax(arr, posi);
	}
}
