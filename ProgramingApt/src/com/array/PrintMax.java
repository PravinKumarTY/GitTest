package com.array;

import java.util.Scanner;

public class PrintMax 
{
    public static void printMax(int x[])
    {
    	int max=x[0];
    	int pos=0;
    	for (int i = 0; i < x.length; i++) 
    	{
			if(max<x[i])
			{
				max=x[i];
				pos=i+1;
			}
		}
    	System.out.print("Max Element of Array"+max+"And its position"+pos);
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
	       printMax(arr);
	}
}
