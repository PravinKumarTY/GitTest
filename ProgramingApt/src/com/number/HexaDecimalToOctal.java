package com.number;

import java.util.Scanner;

public class HexaDecimalToOctal 
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
				res=res+(ch-55)*count;
			}
			else if(ch>=48&&ch<=57)
			{
				res=res+(ch-48)*count;
			}
			else
			{
				return 0;
			}
			count=count*16;
			len--;
		}
		return res;
	}
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
	   System.out.println("Enter the hexa decimal");
	   String hx=sc.next();
	   int deci=hexaToDecimal(hx);
	   String octal=decimalToOctal(deci);
	   System.out.println("Equivalent Octal of"+hx+"is="+octal);
	  // System.out.println(0x123ab);
	}
}
