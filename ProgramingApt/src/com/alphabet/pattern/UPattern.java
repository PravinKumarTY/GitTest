package com.alphabet.pattern;

public class UPattern {

	public static void main(String[] args) 
	{
		int n=15;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <=n/2; j++)
			{
				if((i==n-1&&j!=0&&j!=n/2)||(j==0&&i!=n-1)||(j==n/2&&i!=n-1))
					System.out.print("  U");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
