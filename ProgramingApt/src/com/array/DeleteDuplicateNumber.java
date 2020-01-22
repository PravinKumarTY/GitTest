package com.array;

import java.util.Scanner;

public class DeleteDuplicateNumber
{
	public static void deleteDuplicate(int x[])
	{
		int len=x.length;
		for (int i = 0; i < len-1; i++)
		{
			for (int j = i+1; j < len; j++)
			{
				if(x[i]==x[j])
				{
					int k=j;
					while(k<len-1)
					{
						x[k]=x[k+1];
						k++;
						//j--;
						//len--;
					}
					j--;
					len--;
				}
			}
		}
		for (int i = 0; i <len; i++) 
		{
			System.out.print("\t"+x[i]);
		}
	}
	public static void main(String[] args)
	{
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the size of array");
	       int size=sc.nextInt();
	       int arr[]=new int[size];
	       for (int i = 0; i < arr.length; i++) 
	       {
			  System.out.println("Enter["+i+"] Element");
			  arr[i]=sc.nextInt();
		   }
	       deleteDuplicate(arr);    
	}
}
