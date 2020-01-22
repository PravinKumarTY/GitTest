package com.number;

import java.util.Scanner;

public class DecimalTobinary 
{
	public static String decimalToBinary(int num)
	{
		String str="";
		while(num!=0)
		{
			int rem=num%2;
			str=rem+str;
			num=num/2;
		}
		return str;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int num=sc.nextInt();
		String s1=decimalToBinary(num);
		System.out.println(s1);
	}
}
