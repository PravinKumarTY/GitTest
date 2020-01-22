package com.pattern1;

public class Program5
{
	public static void main(String[] args)
	{
		int count=1;
		for (int i = 0; i <5; i++)
		{
			for (int j = 0; j <5; j++)
			{
				System.out.print(count+++"  ");
			}
			if(i==2)
				count=6;
			else
			count=count+5;
			System.out.println();
		}
		
	}
}
