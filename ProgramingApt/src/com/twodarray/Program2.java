package com.twodarray;

import java.util.Scanner;

public class Program2 
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
			for (int j = 1; j < ar[i].length; j++) 
			{
				System.out.print("ar["+i+"]["+j+"]="+ar[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i < ar.length; i++) 
		{
			int max=ar[i][0];
			int r=0;
			int c=0;
			for (int j = 0; j < ar[i].length; j++) 
			{
				if(max<ar[i][j])
				{
					max=ar[i][j];
					r=i;
					c=j;
				}	
			}
			System.out.println("max="+max+"at ar["+r+"]["+c+"]");
		}	
	}
}
