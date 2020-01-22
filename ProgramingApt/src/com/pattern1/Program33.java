package com.pattern1;

public class Program33 
{
	public static void main(String[] args) 
	{
       int n=5;
       int d=1;
       int st=n/2;
       for (int i =1; i <n; i++) 
       {
		  for (int j =0; j <d; j++) 
		  {
			  System.out.print("   ");
		  }
		  if(i<n/2)
		  {
			  d++;
		  }
		  else
		  {
			  d--;
		  }
		  for (int j =1; j <=st; j++)
		  {
			System.out.print(" * ");
		  }
		  if(i<n/2)
		  {
			  st--;
		  }
		  else
		  {
			  st++;
		  }
		  System.out.println();
		  
		}
	}
}
