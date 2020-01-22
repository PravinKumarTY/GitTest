package com.number;

import java.util.Scanner;

public class HexadecimalToBinary 
{
	public static int hexaToDecimal(String str)
	{
		int len=str.length()-1;
		int res=0;
		int count=1;
		while(len>=0)
		{
			char ch=str.charAt(len);
			if(ch>=97&&ch<=102)
			{
				res=res+(ch-87)*count;
			}
			else if(ch>=65&&ch<=70)
			{
				res=res+(ch-10)*count;
			}
			else if(ch>=48&&ch<=57)
			{
				res=res+(ch-48)*count;
			}
			count=count*16;
			len--;
		}
		return res;
	}
	public static String toBinary(int num)
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
		System.out.println("Enter HexaDecimal Number:-");
		String str=sc.next();
		int a=hexaToDecimal(str);
		String s1=toBinary(a);
		System.out.println("Binary of"+str+"is ="+s1);
		//System.out.println(a);
	}
}
