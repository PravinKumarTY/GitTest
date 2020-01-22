package com.array1;
/*Write a program sort array elements by using bubblesort*/
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int x[])
    {
    	int pass=x.length-1;
    	for(int i=0; i<pass; i++)
    	{
    		for(int j=0; j<x.length-1; j++)
    		{
    			if(x[j]>x[j+1])
    			{
    				int temp=x[j];
    				x[j]=x[j+1];
    				x[j+1]=temp;
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
        bubbleSort(a);
	}
}
