package com.array;

import java.util.Scanner;

public class InsertElement 
{
    public static int[] insert(int x[],int ele,int pos)
    {
    	int nar[]=new int[x.length+1];
    	nar[pos]=ele;
    	for (int i = 0; i<pos; i++)
    	{
			nar[i]=x[i];
		}
    	for (int i=pos+1; i <nar.length; i++)
    	{
			nar[i]=x[i-1];
		}
    	return nar;
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
	       System.out.println("Original Array:");
	       for (int i = 0; i < arr.length; i++)
	       {
			  System.out.print("\t"+arr[i]);
		   }
	       System.out.println();
	       System.out.println("Enter the element to insert in Array:");
	       int ele=sc.nextInt();
	       System.out.println("Enter Position to insert element in array:");
	       int pos=sc.nextInt();
	       int ar[]=insert(arr, ele, pos);
	       System.out.println("New Array :");
	       for (int i = 0; i < ar.length; i++)
	       {
			   System.out.print("\t"+ar[i]);
		   }
	}
}
