package com.alphabet.pattern;
/*
 J  J  J  J  J  J  J
           J         
           J         
           J         
           J         
           J         
           J         
           J         
           J         
           J         
           J         
           J         
  J        J         
  J        J         
     J  J      */

public class JPattern 
{

	public static void main(String[] args) 
	{
		int n=15;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n/2; j++) 
			{
				if(i==0||(j==n/4&&i!=n-1)||(j!=n/4&&i==n-1&&j<=n/4&&j!=0)||(i>3*n/4&&j==0&&i!=n-1))
					System.out.print("  J");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
