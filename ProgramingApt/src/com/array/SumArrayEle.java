package com.array;

import java.util.Scanner;

public class SumArrayEle
{
    public static int sumArrayEle(int x[])
    {
    	int sum=0;
    	for (int i = 0; i < x.length; i++) 
    	{
			sum=sum+x[i];
		}
    	return sum;
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
       int sum1=sumArrayEle(arr);
       System.out.println("Sum Of Array:"+sum1);
	}
}
