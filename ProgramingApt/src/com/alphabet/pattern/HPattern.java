package com.alphabet.pattern;
/* 
  H                    H
  H                    H
  H                    H
  H                    H
  H                    H
  H                    H
  H                    H
  H  H  H  H  H  H  H  H
  H                    H
  H                    H
  H                    H
  H                    H
  H                    H
  H                    H
  H                    H
  */

public class HPattern {

	public static void main(String[] args)
	{
		int n=15;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=n/2; j++)
			{
				if(j==0||j==n/2||i==n/2)
					System.out.print("  H");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
