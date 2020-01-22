package com.pattern1;

public class Program48 
{
	public static void main(String[] args)
	{
        int n=4;
        int count=1;
        for (int i = 0; i <n; i++)
        {
			for (int j = 0; j <n; j++)
			{
				if(i+j>=n-1)
				{
					System.out.print(count--+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			count=count+2*i+3;
		}
	}
}
