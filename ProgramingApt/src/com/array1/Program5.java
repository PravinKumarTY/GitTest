package com.array1;

import java.util.Scanner;

public class Program5 {
    public static void maxThree(int x[])
    {
    	int max1=x[0],pos1=0,max2=x[1],pos2=1,max3=x[2],pos3=2;
    	for (int i = 0; i < x.length; i++) {
			if(max1<x[i])
			{
				max3=max2;
				pos3=pos2;
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
    	System.out.println("The first max element="+max1);
    	System.out.println("First max element position="+pos1);
    	System.out.println("The Second max element="+max2);
    	System.out.println("Second max element position="+pos2);
    	System.out.println("The Third element="+max3);
    	System.out.println("The third element position="+pos3);
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
	      maxThree(a);
	}

}
