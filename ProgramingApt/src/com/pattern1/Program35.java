package com.pattern1;

public class Program35
{
	public static void main(String[] args)
	{
       int n=3;
       for (int i = 0; i <n; i++) 
       {
       	    for (int sp=0; sp<n-1-i; sp++) 
         	{
				System.out.print("   ");
			}
			for (int st = 0; st <=2*i; st++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
       for (int i = n-2; i>=0; i--)
       {
		   for (int sp = 0; sp<n-1-i; sp++)
		   {
			   System.out.print("   ");
		   }
		   for (int j = 0; j <=2*i; j++) 
		   {
			   System.out.print(" * ");
		   }
		   System.out.println();
	   }
	}
}
