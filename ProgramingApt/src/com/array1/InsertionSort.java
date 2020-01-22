package com.array1;

import java.util.Scanner;
/*Write a program to sort array by using insertionSort algorithm*/
public class InsertionSort {
    public static void insertionSort(int x[])
    {
    	int i=0;
    		for (int j = 1; j < x.length; j++) {
				int temp=x[j];
				i=j-1;
				while(i>=0&&x[i]>temp)
				{
					x[i+1]=x[i];
					x[i]=temp;
					i--;
				}
			}
    	for (int i1 = 0; i1 < x.length; i1++) {
			System.out.print("\t"+x[i1]);
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
        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) {
			System.out.print("\t"+a[i]);
		}
        System.out.println();
        insertionSort(a);
	}
}
