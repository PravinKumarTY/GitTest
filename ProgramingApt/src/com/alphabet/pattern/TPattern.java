package com.alphabet.pattern;

public class TPattern 
{

	public static void main(String[] args)
	{
		int n=15;
        for (int i = 0; i <n; i++)
        {
			for (int j = 0; j <n; j++) 
			{
				if(i==0||j==n/2)
					System.out.print("  T");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
