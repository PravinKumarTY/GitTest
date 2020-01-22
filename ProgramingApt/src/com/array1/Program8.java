package com.array1;

import java.util.Scanner;

public class Program8 {
    public static void findMissing(int x[])
    {
    	for (int i = 0; i < x.length-1; i++) {
			for (int j = x[i]+1; j < x[i+1]; j++) {
				
				System.out.print("\t"+j);
			}
			System.out.print("\t"+x[i+1]);
		}
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
        findMissing(a);
	}

}
