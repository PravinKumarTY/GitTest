package com.pattern;
/*
     1 
    1 2 1 
  1 2 3 2 1 
1 2 3 4 3 2 1 
  1 2 3 2 1 
    1 2 1 
      1 

 */
public class NumberPattern3 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i = 0; i <n; i++)
		{
			int count=1;
			for (int j = 0; j <n-1-i; j++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*i; j++)
			{
				if(j<i)
				System.out.print(count+++" ");
				else
				System.out.print(count--+" ");
			}
			System.out.println();
		}
		for (int i = n-2; i>=0; i--)
		{
			int count=1;
			for (int j = 0; j <n-1-i; j++) 
			{
				System.out.print("  ");
			}
			for (int j = 0; j <=2*i; j++)
			{
				if(j<i)
				System.out.print(count+++" ");
				else
				System.out.print(count--+" ");
			}
			System.out.println();
		}
	}
}
