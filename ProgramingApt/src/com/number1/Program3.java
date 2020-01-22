package com.number1;

import java.util.Scanner;

public class Program3 
{
	public static String decimalToOctal(int num)
	{
		String str="";
		while(num!=0)
		{
			int rem=num%8;
			str=rem+str;
			num=num/8;
		}
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
		String s1=decimalToOctal(a);
		System.out.println("Octal ="+s1+" of="+a);
	}
}
