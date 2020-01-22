package com.pattern1;

public class Program36
{
	public static void main(String[] args) 
	{
	   int n=3;
	   for (int i = 0; i <3; i++) 
	   {
		  for (int sp = 0; sp <n-1-i; sp++) 
		  {
			 System.out.print("   ");
		  }
		  for (int st = 0; st <=2*i; st++)
		  {
			  if(st==0||st==2*i)
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
	   for (int i=n-2; i>=0; i--) 
	   {
		   for (int sp = 0; sp<n-1-i; sp++)
		   {
			   System.out.print("   ");
		   }
		   for (int j = 0; j <=2*i; j++) 
		   {
			   if(j==0||j==2*i)
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
