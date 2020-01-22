package com.pattern1;

public class Program42
{
	public static void main(String[] args)
	{
		int n=4;
		for (int i = 0; i <n; i++) 
		{
			char ch='A';
			for (int spaces = 0; spaces<n-1-i; spaces++) 
			{
				System.out.print("   ");
			}
			for (int st = 0; st <=2*i; st++)
			{
				if(st<i)
				{
				   System.out.print(ch+++"  ");
				}
				else
				{
					System.out.print(ch--+"  ");
				}
			}
			System.out.println();
		}
		/*char ch='A';
		int c2=ch+1;
		char c3=ch++;
		System.out.println("ch="+ch);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		System.out.println("ch="+ch);
		        ch=B
				c2=66
				c3=A
				ch=B*/

	}
}
