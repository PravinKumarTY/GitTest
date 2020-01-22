package com.number;

import java.util.Scanner;

public class OcatalToDecimal 
{
	public static boolean isOctal(int num)
	{
		while(num!=0)
		{
			int rem=num%10;
			if(rem>7)
			{
				return false;
			}
			num=num/10;
		}
		return true;
	}
    public static int  ocatalToDecimal(int num)
    {
		int res=0;
		int count=1;
		while(num!=0)
		{
			int rem=num%10;
			 res=res+rem*count;
			 count=count*8;
			 num=num/10;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Octal Number");
		int n=sc.nextInt();
		boolean b1=isOctal(n);
		if(b1==true)
		{
		  int a=ocatalToDecimal(n);
		  System.out.println("a="+a);
		}
		else
		{
			System.out.println("Invalid Number");
		}
		//System.out.println(0967);
	}
}
