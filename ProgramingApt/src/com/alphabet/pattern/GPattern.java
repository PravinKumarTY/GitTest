package com.alphabet.pattern;

public class GPattern 
{
	public static void main(String[] args) 
	{
		int n=15;
        for (int i = 0; i <n; i++)
        {
			for (int j = 0; j <=n/2; j++)
			{
				if((i==0&&j!=0)||(j==0&&i!=0&&i!=n-1)||(i==n-1&&j!=0&&j!=n/2)||(j==n/2&&i>=n/2&&i!=n-1&i!=n/2)||(i==n/2&&j>n/4&&j!=n/2))
					System.out.print("  G");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
