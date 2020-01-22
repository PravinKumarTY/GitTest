package com.pattern1;

public class Program38 
{

	public static void main(String[] args) 
	{
		int n=4;
		for (int i = 0; i <n; i++)
		{
			int count=1;
			for (int j = 0; j <n-1-i; j++)
			{
				System.out.print("   ");
			}
			for (int num = 0; num <=2*i; num++)
			{
				System.out.print(count+++"  ");
			}
			System.out.println();
		}
	}
}
