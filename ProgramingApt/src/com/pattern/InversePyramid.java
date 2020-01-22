package com.pattern;
/*
 * * * * * * *
   * * * * *
     * * *
       *
 */

public class InversePyramid {

	public static void main(String[] args)
	{
		int n=4;
		for(int i=n-1; i>=0; i--)
		{
			for(int spaces=0; spaces<n-1-i; spaces++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=2*i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
