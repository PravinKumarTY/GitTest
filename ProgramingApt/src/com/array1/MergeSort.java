package com.array1;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[]A)
    {
    	int n=A.length;
    	if(n<2)
    		return;
    	int mid=n/2;
    	int left[]=new int[mid];
    	int right[]=new int[n-mid];
    	for (int i = 0; i <mid; i++) {
			left[i]=A[i];
		}
    	for (int i = mid; i <n; i++) {
			right[i-mid]=A[i];
		}
    	mergeSort(left);
    	mergeSort(right);
    	merge(left, right, A);
    }
    public static void merge(int left[],int right[],int[] A)
    {
    	int n=A.length;
    	int nl=left.length;
    	int nr=right.length;
    	int i=0,j=0,k=0;
    	while(i<nl&&j<nr)
    	{
    		if(left[i]<=right[j])
    		{
    			A[k]=left[i];
    			i++;
    		}
    		else
    		{
    			A[k]=right[j];
    			j++;
    		}
    		k++;
    	}
    	while(i<nl)
    	{
    		A[k]=left[i];
    		i++;
    		k++;
    	}
    	while(j<nr)
    	{
    		A[k]=right[j];
    		j++;
    		k++;
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
        System.out.println("Before sorting elements are:");
        for (int i = 0; i < a.length; i++) {
			System.out.print("\t"+a[i]);
		}
       mergeSort(a);
       System.out.println();
       for (int i = 0; i < a.length; i++) {
		System.out.print("\t"+a[i]);
	}
	}

}
