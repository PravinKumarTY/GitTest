package com.number1;

import java.util.Scanner;

public class Program5 
{
	public static String decimalToHexa(int num)
	{
		String str1="";
		String s1="0123456789ABCDEF";
		while(num!=0)
		{
			int rem=num%16;
			str1=s1.charAt(rem)+str1;
			num=num/16;
		}
		return str1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int deci=sc.nextInt();
		String str=decimalToHexa(deci);
		System.out.println("Hexadecimal="+str+" of="+deci);
		//System.out.println(0x160B);
	}
}
