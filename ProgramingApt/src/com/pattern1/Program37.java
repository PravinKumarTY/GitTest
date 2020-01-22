package com.pattern1;

public class Program37
{
	public static void main(String[] args) 
	{
       int n=5;
      /* for (int i = 0; i <n; i++) 
       {
		   for (int j = 0; j <=i; j++)
		   {
			   if(j==0||j==i||i==n-1)
			   {
			     System.out.print(" * ");
			   }
			   else
			   {
				 System.out.print("   ");
			   }
		   }
		   System.out.println();
	   }*/
      /* for (int i = 0; i <n; i++) 
       {
		   for (int j = 0; j < n; j++) 
		   {
			   if(i+j>=n-1)
			   {
				   if(i+j==n-1||j==n-1||i==n-1)
				   {
				      System.out.print(" * ");
				   }
				   else
				   {
					  System.out.print("   ");
				   }
			   }
			   else
			   {
				   System.out.print("   ");
			   }
		   }
		   System.out.println();
	   }*/
       /*for(int i=0; i<n; i++)
       {
    	   for (int j = 0; j <n; j++)
    	   {
			   if(i<=j)
			   {
				   if(i==0||i==j||j==n-1)
				   {
				      System.out.print(" * ");
				   }
				   else
				   {
					  System.out.print("   ");
				   }
			   }
			   else
			   {
				   System.out.print("   ");
			   }
		   }
    	   System.out.println();
       }*/
       for (int i = 0; i <n; i++) 
       {
		   for (int j = 0; i+j <=n-1; j++) 
		   {
			   if(i==0||j==0||i+j==n-1)
			   {
			     System.out.print(" * ");
			   }
			   else
			   {
				 System.out.print("   ");
			   }
		   }
		   System.out.println();
	   }
	}
}
