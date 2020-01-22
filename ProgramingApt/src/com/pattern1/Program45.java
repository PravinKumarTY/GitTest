package com.pattern1;

public class Program45 
{
	public static void main(String[] args)
	{
		int count=1;
		int n=4;
		for (int i = 0; i <n; i++)
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(count--+" ");
			}
			count=count+3+(2*i);
			System.out.println();
		}
		/*int x=0,c=1,n=4;
		for (int i = 0; i <n; i++)
		{
			x=x+c++;
			int z=x;
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(z--+" ");
			}
			System.out.println();
		}*/	
	}
}
