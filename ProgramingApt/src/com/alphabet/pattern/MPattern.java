package com.alphabet.pattern;
/*
  M                                         M
  M  M                                   M  M
  M     M                             M     M
  M        M                       M        M
  M           M                 M           M
  M              M           M              M
  M                 M     M                 M
  M                    M                    M
  M                                         M
  M                                         M
  M                                         M
  M                                         M
  M                                         M
  M                                         M
  M                                         M
*/

public class MPattern 
{
	public static void main(String[] args)
	{
		int n=15;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++)
			{
				if(j==0||(i==j&&j<=n/2)||(j==n-1)||(i+j==n-1&&j>n/2))
					System.out.print("  M");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
