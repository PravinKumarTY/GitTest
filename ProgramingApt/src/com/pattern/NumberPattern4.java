package com.pattern;
/*
   1
  1*2
 1*2*3
1*2*3*4
 */
public class NumberPattern4 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i = 0; i <n; i++)
		{
			int count=1;
			for (int spaces = 0; spaces <n-1-i; spaces++)
			{
				System.out.print(" ");
			}
			for(int str=0; str<=2*i; str++)
			{
				if(str%2!=0)
				System.out.print("*");
				else
				System.out.print(count+++"");
			}
			System.out.println();
		}		
	}
}
