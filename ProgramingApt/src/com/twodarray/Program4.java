package com.twodarray;

import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row=sc.nextInt();
		System.out.println("Enter the no of cols");
		int cols=sc.nextInt();
		int ar[][]=new int[row][cols];
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.println("Enter the["+i+"]["+j+"] elements");
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array elements are:");
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.print("ar["+i+"]["+j+"]="+ar[i][j]+" ");
			}
			System.out.println();
		}
		int ubig=ar[0][1];
		int dbig=ar[0][0];
		int lbig=ar[1][0];
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				if(i==j)
				{
					if(dbig<ar[i][j])
					{
						dbig=ar[i][j];
					}
				}
				else if(i>j)
				{
					if(lbig<ar[i][j])
					{
						lbig=ar[i][j];
					}
				}
				else if(i<j)
				{
					if(ubig<ar[i][j])
					{
						ubig=ar[i][j];
					}
				}
			}
		}
		System.out.println(ubig);
		System.out.println(dbig);
		System.out.println(lbig);
	}
}
