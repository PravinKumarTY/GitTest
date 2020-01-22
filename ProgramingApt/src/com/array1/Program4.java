package com.array1;

import java.util.Scanner;

public class Program4 {
    public static void maxTwo(int x[])
    {
    	int max1=x[0],pos1=0,max2=x[1],pos2=1;
    	
    	for (int i = 1; i < x.length; i++) {
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
    	System.out.println("The First max element="+max1);
    	System.out.println("The position of first max="+pos1);
    	System.out.println("The Second max element="+max2);
    	System.out.println("The position of second max element="+pos2);
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
	      maxTwo(a);
	}
}
