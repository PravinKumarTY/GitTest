package com.pattern1;

public class Program41 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i = 0; i <n; i++) 
		{
			int count=1;
			for (int spaces= 0; spaces <n-1-i; spaces++)
			{
				System.out.print("   ");
			}
			for (int num = 0; num <=2*i; num++) 
			{
				if(num%2!=0)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print(count+"  ");
				    count=count+2;
				}
			}
			System.out.println();
		}
	}
}
