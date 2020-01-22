package com.array;

import java.util.Scanner;

public class ReverseArray
{
    public static int[] reverse(int x[])
    {
    	/*for (int i = 0; i < x.length/2; i++)
    	{
			int t=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=t;
		}*/
    	//without temparory variable
    	for (int i = 0; i < x.length/2; i++) 
    	{
			x[i]=x[i]+x[x.length-1-i];
			x[x.length-1-i]=x[i]-x[x.length-1-i];
			x[i]=x[i]-x[x.length-1-i];
		}
    	return x;
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
	       System.out.println("Original Array Elements:");
	       for (int i = 0; i < arr.length; i++) 
	       {
			 System.out.print("\t"+arr[i]);
		   }
	       int []x1=reverse(arr);
	       System.out.println();
	       System.out.println("Reverse Array:");
	       for (int i = 0; i < x1.length; i++)
	       {
			   System.out.print("\t"+x1[i]);
		   }
	}
}
