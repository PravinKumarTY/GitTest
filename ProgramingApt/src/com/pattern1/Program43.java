package com.pattern1;
/*
Aa 
Aa Bb Cc 
Aa Bb Cc Dd Ee 
Aa Bb Cc Dd Ee Ff Gg 
Aa Bb Cc Dd Ee Ff Gg Hh Ii 
 */
/*
A 
A B 
A B C 
A B C D 
*/
public class Program43 
{
	public static void main(String[] args)
	{
		int n=4;
		/*for (int i = 0; i <n; i++) 
		{
			char ch='A';
			char ch1='a';
			for (int j = 0; j <=2*i; j++)
			{
				System.out.print(ch+++""+ch1+++" ");
			}
			System.out.println();
		}*/
		for (int i = 0; i <n; i++)
		{
			char ch='A';
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}
}
