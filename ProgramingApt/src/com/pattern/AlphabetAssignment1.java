package com.pattern;

public class AlphabetAssignment1
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i =0; i <n; i++)
		{
			char ch='A';
			char ch1='a';
			for (int j = 0; j <=i; j++)
			{
                System.out.print(ch+++""+ch1+++" ");
                //System.out.print(ch1+++" ");
			}
			System.out.println();
		}
	}
}
