package com.pattern1;

public class Program9 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <5; i++) 
		{
			for (int j = 0; j <5; j++)
			{
				if(i==2||(i==0&&j==2)||(i==1&&j==3)||(i==3&&j==3)||(i==4&&j==2))
						System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i <5; i++)
		{
			for (int j = 0; j <5; j++) 
			{
				if(i==2||(i==0&&j==2)||(i==1&&j==1)||(i==3&&j==1)||(i==4&&j==2))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i =0; i < 5; i++) 
		{
			for (int j =0; j <10; j++) 
			{
				if(j==2||(i==1&&j==1)||(i==2&&j==0)||(i==1&&j==3)||(i==2&&j==4)||j==7||(j==6&&i==3)||(j==5&&i==2)||(j==8&&i==3)||(j==9&&i==2))
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
