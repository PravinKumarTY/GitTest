package com.pattern1;

public class Program50
{
	public static void main(String[] args)
	{
       int count=1;
       int n=4;
       for (int i = 0; i <n; i++)
       {
		   for (int j = 0; j <= 2*i; j++)
		   {
			   if(j%2!=0)
			   {
				   System.out.print(" * ");
			   }
			   else
			   {
			       System.out.print(count--+" ");
			   }
		   }
		   System.out.println();
		   count=count+2*i+3;
	   }
	}
}
