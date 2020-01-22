package com.array1;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int arr[],int left,int right)
    {
    	int index=partition(arr,left,right);
    	if(left<index-1)
    		quickSort(arr, left, index-1);
    	if(index<right)
    		quickSort(arr, index, right);
    }
    public static int partition(int arr[],int l,int r)
    {
    	int p=arr[(l+r)/2];
    	while(l<=r)
    	{
    		while(arr[l]<p)l++;
    		while(arr[r]>p)r--;
    		if(l<=r)
    		{
    			int temp=arr[l];
    			arr[l]=arr[r];
    			arr[r]=temp;
    			l++;
    			r--;
    		}
    	}
    	return l;
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
        System.out.println("Before sorting elements are:");
        for (int i = 0; i < a.length; i++) {
			System.out.print("\t"+a[i]);
		}
        System.out.println();
        quickSort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
			System.out.print("\t"+a[i]);
		}
        
	}
}
