package com.pattern;
/*   
         *
       * * *
     * * * * *
   * * * * * * *
*/

public class Pyramid 
{
	public static void main(String[] args) 
	{
		int n=4;
        for(int i=0; i<n; i++)
        {
        	for(int str=0; str<=n-1-i; str++)
        	{
        		System.out.print("  ");
        	}
        	for(int j=0; j<=2*i;j++)
        	{
        		System.out.print(" *");
        	}
        	System.out.println();
        }
        
	}
}
