package com.array1;

import java.util.Scanner;

public class Program9 {
    public static void deleteRepeated(int x[])
    {
    	int n=x.length;
    	for (int i = 0; i <n; i++) {
			for (int j =i+1; j <n; j++) {
				if(x[i]==x[j])
				{
					int k=j;
					while(k<n-1)
					{
						x[k]=x[k+1];
						k++;
					}
					n--;
					j--;
				}
			}
		}
    	for(int i=0; i<n; i++)
    	{
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
        deleteRepeated(a);
	}

}
