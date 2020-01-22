package com.pattern1;

public class Program51
{
	public static void main(String[] args) 
	{
		char ch[][]=new char[6][6];
		char ch1='A';
		char ch2='A';
		char ch3='A';
		char ch4='A';
		for (int i=1; i< ch.length; i++)
		{
			ch[0][i]=ch1++;
		}
		for (int i =1; i < ch.length; i++) 
		{
			ch[i][5]=ch2++;
		}
		for (int i = ch.length-2; i >=0; i--)
		{
			ch[5][i]=ch3++;
		}
		for (int i = ch.length-2; i >=0; i--)
		{
			ch[i][0]=ch4++;
		}
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = 0; j < ch[i].length; j++) 
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}
}
