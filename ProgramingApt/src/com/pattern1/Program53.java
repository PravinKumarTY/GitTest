package com.pattern1;
/*
  *  *  *  *  *  *  *  *  * 
    *  *  *  *  *  *  * 
       *  *  *  *  * 
          *  *  * 
             * 
          *  *  * 
       *  *  *  *  * 
    *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  * 
 */
public class Program53 
{
	public static void main(String[] args)
	{
		int n=5;
		for (int i = n-1; i>=0; i--) 
		{
			for (int spaces = 0; spaces< n-1-i; spaces++)
			{
				System.out.print("   ");
			}
			for (int star = 0; star <=2*i; star++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) 
		{
			for (int spaces= 0; spaces<n-1-i; spaces++)
			{
				System.out.print("   ");
			}
			for (int star = 0; star <=2*i; star++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
