package com.pattern;

public class Program1 {

	public static void main(String[] args) 
	{
		int count=1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print(count+++" ");
			}
			count=count+5;
			if(i==2)
				count=6;
			System.out.println();
		}

	}

}
