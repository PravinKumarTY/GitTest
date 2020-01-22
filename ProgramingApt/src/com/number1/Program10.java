package com.number1;

import java.util.Scanner;

public class Program10 {
	public static int hexaToDecimal(String str)
	{
		int res=0;
		int len=str.length()-1;
		int count=1;
		while(len>=0)
		{
			char c=str.charAt(len);
			if(c>=97&&c<=102)
			{
				res=res+(c-87)*count;
			}
			else if(c>=65&&c<=70)
			{
				res=res+(c-55)*count;
			}
			else if(c>=48&&c<=53)
			{
				res=res+(c-48)*count;
			}
			else
			{
				//System.out.println("Invalid Number");
				return 0;
			}
			len--;
			count=count*16;
		}
		return res;
	}
	public static String toOctal(String str)
	{
		int num=hexaToDecimal(str);
		if(num!=0)
		{
		String s1="";
		while(num!=0)
		{
			int rem=num%8;
			s1=rem+s1;
			num=num/8;
		}
		return s1;
		}
		else
		{
			return "Invalid number";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther hexadecimal:");
		String str=sc.next();
		String oct=toOctal(str);
		System.out.println("Octal "+oct+" of equivalent="+str);	
	}

}
