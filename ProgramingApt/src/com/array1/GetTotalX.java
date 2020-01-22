package com.array1;

import java.util.Scanner;

public class GetTotalX {
    public static int getTotalX(int a[],int b[])
    {
    	int x=1,j=0,count=0,r=0;
    	int d[]=new int[101];
    	for(x=1; x<101; x++)
    	{
    		int c=0;
    		for (int i = 0; i < a.length; i++) {
				if(x%a[i]==0&&x>=a[i])
				{
					c++;
				}
			}
    		if(c==a.length)
    		{
    			d[j]=x;
    			j++;
    			r++;
    		}
    	}
    	for ( j = 0; j <r; j++) {
			int c=0;
			for (int i = 0; i < b.length; i++) {
				if(b[i]%d[j]==0)
				{
					c++;
				}
			}
			if(c==b.length)
			{
				count++;
			}
		}
    	return count;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//First array declaration
		int a[]=new int[2];
		System.out.println("Enter first array elements:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Entera["+i+"]position elements");
			a[i]=sc.nextInt();
		}
		//Second array Declaration
		int b[]=new int[3];
		System.out.println("Enter Second array elements:");
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter["+i+"]position elements");
			b[i]=sc.nextInt();
		}
      int total=getTotalX(a, b);
      System.out.println("Total X="+total);
	}
}
