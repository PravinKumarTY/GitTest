package com.array1;

import java.util.Scanner;

public class Program11 {
    public static int[] insert(int a[],int ele,int pos)
    {
    	int nar[]=new int[a.length+1];
    	nar[pos]=ele;
    	for (int i = 0; i < pos; i++) {
			nar[i]=a[i];
		}
    	for (int i =pos+1; i < nar.length; i++) {
			nar[i]=a[i-1];
		}
    	return nar;
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
        System.out.println("Enter Element to insert:");
        int ele=sc.nextInt();
        System.out.println("Enter Position to insert:");
        int pos=sc.nextInt();
        if(pos>a.length)
        {
        	System.out.println("Invalid Index:");
        }
        else
        {
           System.out.println("After insert array elements are:");
           int a1[]=insert(a, ele, pos);
           for (int i = 0; i < a1.length; i++) {
			  System.out.print(" "+a1[i]);
		   }
        }
	}
}
