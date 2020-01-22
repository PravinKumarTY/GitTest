package com.number1;

import java.util.Scanner;

public class Program11 {
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
	public static String toBinary(String str)
	{
		int num=hexaToDecimal(str);
		String s1="";
		while(num!=0)
		{
			int rem=num%2;
			s1=rem+s1;
			num=num/2;
		}
		return s1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ther hexadecimal:");
		String str=sc.next();
		String bin=toBinary(str);
		System.out.println("Binary "+bin+" of equivalent="+str);
	}

}
