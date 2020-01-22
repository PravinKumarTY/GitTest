package com.number;

import java.util.Scanner;

public class BinaryToHexaDecimal 
{
	public static boolean isBoolean(int num)
	{
		while(num!=0)
		{
			int rem=num%10;
			if(rem>1)
			{
				return false;
			}
			num=num/10;
		}
		return true;
	}
	public static int binaryToDecimal(int num)
	{
		int res=0;
		int count=1;
		while(num!=0)
		{
			int rem=num%10;
			res=res+rem*count;
			count=count*2;
			num=num/10;
		}
		return res;
	}
	public static String decimalToHexadecimal(int num)
	{
		String str="0123456789ABCDEF";
		String str1="";
		while(num!=0)
		{
			int rem=num%16;
			str1=str.charAt(rem)+str1;
			num=num/16;
		}
		return str1;
	}
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Binary No:-");
      int n=sc.nextInt();
      boolean b=isBoolean(n);
      if(b==true)
      {
    	  int n1=binaryToDecimal(n);
    	  String s=decimalToHexadecimal(n1);
    	  System.out.println("Hexadecimal of "+n+" is="+s);
      }
      else
      {
    	  System.out.println("Invalid Number");
      }
	}
}
