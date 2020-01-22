package com.array1;
/*Write a program to sort array elements by using selection sort*/
import java.util.Scanner;

public class Selectionsort {
	public static void selectionShort(int x[])
	{
		for (int i = 0; i < x.length-1; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print("\t"+x[i]);
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
        selectionShort(a);
	}

}
