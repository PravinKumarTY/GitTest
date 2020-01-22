package com.number1;

import java.util.Scanner;

public class Program7 
{
	public static int binToDec(int num)
	{
		int res=0;
		int count=1;
		while(num!=0)
		{
			int rem=num%10;
			res=res+rem*count;
			num=num/10;
			count=count*2;
		}
		return res;
	}
	public static String binaryToOctal(int num)
	{
		int dec=binToDec(num);
		String str="";
		while(dec!=0)
		{
			int rem=dec%8;
			str=rem+str;
			dec=dec/8;
		}
		return str;
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary Number:");
        int bin=sc.nextInt();
        String oct=binaryToOctal(bin);
        System.out.println("Decimal="+oct+" of="+bin);
	}
}
