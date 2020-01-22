package com.pattern1;

public class Program34
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
	}
}
