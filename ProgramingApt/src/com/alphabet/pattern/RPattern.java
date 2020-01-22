package com.alphabet.pattern;

public class RPattern 
{
	public static void main(String[] args)
	{
		int n=15;
       for (int i = 0; i <n; i++)
       {
		  for (int j =n/2; j <n; j++)
		  {
			if((i==0&&j!=n/2&&j!=n-1)||(j==n/2&&i!=0)||(i==n/2&&j!=n-1)||(j==n-1&&i!=0&&i!=n/2&&i<=n/2)||(i==j))
				System.out.print("  R");
			else
				System.out.print("   ");
		  }
		  System.out.println();
	   }
	}
}
