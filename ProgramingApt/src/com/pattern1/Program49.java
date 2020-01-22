package com.pattern1;

public class Program49 
{
	public static void main(String[] args) 
	{
        int n=6;
        for (int i = 0; i <n; i++) 
        {
			for (int j = 0; j <=n; j++) 
			{
				if(j==n/2)
					System.out.print(i+1+" ");
				else
					System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
