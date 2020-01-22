package com.number;

import java.util.Scanner;

public class BinaryToOctal
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
	public static int  binaryToDecimal(int num)
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
	public static String decimalToOctal(int n)
	{
		int num=binaryToDecimal(n);
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
        System.out.println("Enter Binary Number");
        int n=sc.nextInt();
        boolean b=isBoolean(n);
        if(b==true)
        {
        int a=binaryToDecimal(n);
        String s1=decimalToOctal(a);
        System.out.println("Decimal of"+n+"is ="+a);
        System.out.println("Octal of "+a+"is ="+s1);
        }
        else
        {
        	System.out.println("Invalid Number:-");
        }
        //System.out.println(0b110011);
        //System.out.println(051);
	}
}
