package com.pattern;

public class HollowTriangle2 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i = 0; i <n; i++)
		{
			for (int j = 0; i+j<=n-1; j++)
			{
				if(j==0||i+j==n-1||i==0)
				{
				  System.out.print(" *");
				}
				else
				{
				  System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
