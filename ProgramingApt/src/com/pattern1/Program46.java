package com.pattern1;

public class Program46 
{
	public static void main(String[] args) 
	{
       int n=5;
      // int count=1;
       for (int i = 0; i < n; i++) 
       {
    	   int count=i+1;
		   for (int j = 0; j <=i; j++)
		   {
			  System.out.print(count+" ");
			  count=count+n-1+j;
		   }
		  // count=count+i+n-1-j;
		   System.out.println();
	   }
	}
}
