package com.alphabet.pattern;
/*
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L                     
  L  L  L  L  L  L  L  L
*/

public class LPattern
{

	public static void main(String[] args)
	{
		int n=15;
       for(int i=0; i<n; i++)
       {
    	   for (int j = 0; j <=n/2; j++) 
    	   {
			 if(i==n-1||j==0)
				 System.out.print("  L");
			 else
				 System.out.print("   ");
		   }
    	   System.out.println();
       }
	}

}
