package com.array1;

import java.util.Scanner;

public class SumMax {
	public static int[] sumMax(int x[],int k)
	{
		int a[]=new int[k];
		int sum=0;
		int len=x.length;
		for (int i = 0; i < len-k; i++) {
			int sum1=0;
			for (int j = 0; j <a.length; j++) {
				sum1=sum1+x[i+j];
			}
			//sum=sum1;
			if(sum1>sum)
			{
				for (int j = 0; j < a.length; j++) {
					a[j]=x[i+j];
				}
				sum=sum1;
			}
			//k--;
		}
		return a;
		//System.out.println(sum);
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
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        int a1[]=sumMax(a, k);
        for (int i = 0; i < a1.length; i++) {
			System.out.print("\t"+a1[i]);
		}
	}

}
