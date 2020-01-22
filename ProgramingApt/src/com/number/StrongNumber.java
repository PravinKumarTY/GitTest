package com.number;

import java.util.Scanner;

public class StrongNumber 
{
	public static boolean isStrong(int num)
	{
		int t=num;
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			res=res+isFact(rem);
			num=num/10;
		}
		return((t==res)? true:false);
	}
	public static int isFact(int num)
	{
		int fact=1;
		while(num>1)
		{
			fact=fact*num--;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		String str="";
		for(int i=1; i<=10000; i++)
		{
		  boolean b=isStrong(i);
		   if((b==true))
		   {
			  str=str+" "+i;
		   }	
		}
		System.out.println("Strong Number:"+str);
	}
}
