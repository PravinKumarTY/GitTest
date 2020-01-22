package com.array1;

import java.util.Scanner;

public class Program7 {
    public static int[] sort(int x[])
    {
    	for (int i = 0; i < x.length-1; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]>x[j])
				{
					int t=x[i];
					x[i]=x[j];
					x[j]=t;
				}
			}
		}
    	return x;
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
        int x1[]=sort(a);
        for (int i = 0; i < x1.length; i++) {
			System.out.print("\t"+x1[i]);
		}
	}
}
