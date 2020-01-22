package com.number;

import java.util.Scanner;

public class PalindromNum 
{
    public static boolean isPalindrom(int num)
    {
    	int c=num;
    	int num1=0;
    	while(num!=0)
    	{
    		int rem=num%10;
    		num1=num1*10+rem;
    		num=num/10;
    	}
    	if(c==num1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
	public static void main(String[] args)
	{
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int num1=sc.nextInt();
		//boolean b1=isPalindrom(num1);
		//System.out.println(b1?"Palindrom Number":"Not Palindrom");
		for (int i = 1; i <num1; i++)
		{
			boolean b1=isPalindrom(i);
			if(b1==true&&i>10)
			{
				str=str+" "+i;
			}
		}
		System.out.println(str);
	}
}
