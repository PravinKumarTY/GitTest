package com.array;

import java.util.Scanner;

public class FirstThreeMax 
{
    public static void maxThree(int x[])
    {
    	int max1=x[0],pos1=0;
    	int max2=x[1],pos2=1;
    	int max3=x[2],pos3=2;
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
				max3=max2;
				pos3=pos2;
				max2=x[i];
				pos2=i;
			}
			else if(max3<x[i])
			{
				max3=x[i];
				pos3=i;
			}
		}
    	System.out.println("First Max Number ="+max1+" at "+pos1+" position");
    	System.out.println("Second Max Number ="+max2+" at "+pos2+" position");
    	System.out.println("Third Max Number ="+max3+" at "+pos3+" position");
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
	       System.out.println();
	       for (int i = 0; i < arr.length; i++) 
	       {
			   System.out.print("\t"+arr[i]);
		   }
	       System.out.println();
	       maxThree(arr);
	}
}
