package com.pattern1;

public class Program19 
{
	public static void main(String[] args)
	{
		int n=15;
		for (int i = 0; i <n; i++) 
		{
			for (int j = n/2; j <n; j++)
			{
				if(i==j||(i+j)==n-1||j==n/2)
				{
					System.out.print(" k ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
