package com.alphabet.pattern;

public class FPattern 
{
	public static void main(String[] args)
	{
		int n=15;
	     for (int i = 0; i <n; i++) 
	     {
			for (int j = 0; j < n/2; j++)
			{
				if(i==0||i==n/2||j==0)
					System.out.print(" F");
				else
					System.out.print("  ");
			}
			System.out.println();
		 }
	}
}
