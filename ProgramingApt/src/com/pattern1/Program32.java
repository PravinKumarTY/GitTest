package com.pattern1;

public class Program32 
{
	public static void main(String[] args)
	{
		int count=0;
		int n=5;
		for (int i = 0; i <n; i++)
		{
			for (int j = 0; j <=count; j++)
			{
				System.out.print(" * ");
			}
			if(i<n/2)
			{
				count++;
			}
			else
			{
				count--;
			}
			System.out.println();
		}
	}

}
