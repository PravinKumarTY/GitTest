package com.pattern1;

import java.util.Scanner;

public class UnionOfArray 
{
	public static int[] union(int x[],int y[])
	{
		int u[]=new int[x.length+y.length];
		int i=0;
		int len=u.length;
		for (i= 0; i<x.length; i++) 
		{
			u[i]=x[i];
		}
		for ( int j = 0; j < y.length; j++)
		{
			u[i++]=y[j];
		}
		for (int j = 0; j < len; j++) 
		{
			for (int j2 =j+1; j2 < len; j2++)
			{
				if(u[j]==u[j2])
				{
					int k=j2;
					while(k<len-1)
					{
						u[k]=u[k+1];
						k++;
					}
					j2--;
					len--;
				}
			}
		}
		
		return u;
	}
	public static void main(String[] args)
	{
       /*Scanner sc=new Scanner(System.in);
       System.out.println("Enter first array elements:");
       int a[]=new int[5];
       for (int j = 0; j < a.length; j++)
       {
		a[j]=sc.nextInt();
	   }
       System.out.println("Enter Second array elements:");
       int b[]=new int[5];
       for (int j = 0; j< b.length; j++)
       {
		 b[j]=sc.nextInt();
	   }*/
       int res[]=union(new int[] {5,8,10,12,14},new int[] {10,12,15,18,12});
       for (int i = 0; i < res.length; i++)
       {
		  System.out.print(res[i]+" ");
	   }
	}
}
