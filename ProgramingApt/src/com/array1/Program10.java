package com.array1;

import java.util.Scanner;

public class Program10 {
    public static int[] reverse(int a[])
    {
    	for (int i = 0; i < a.length/2; i++) {
			/*int t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;*/
    		a[i]=a[i]+a[a.length-1-i];
    		a[a.length-1-i]=a[i]-a[a.length-1-i];
    		a[i]=a[i]-a[a.length-1-i];
		}
    	return a;
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
		int a1[]=reverse(a);
		for (int i = 0; i < a1.length; i++) {
			System.out.print(" "+a1[i]);
		}
	}
}
