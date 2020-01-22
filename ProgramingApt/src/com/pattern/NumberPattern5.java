package com.pattern;

public class NumberPattern5 
{
	public static void main(String[] arg)
	{
		/*int n=4;
		int count=1;
		for (int i = 0; i <n; i++)
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(count--+" ");
			}
			System.out.println();
			count=count+2*i+3;
		}*/
		int x=0,c=1,n=4;
		for (int i = 0; i <n; i++) 
		{
			x=x+c++;
			int z=x;
			for (int j = 0; j <=i; j++)
			{
				System.out.print(z--+" ");
			}
			System.out.println();
		}
	}

}
