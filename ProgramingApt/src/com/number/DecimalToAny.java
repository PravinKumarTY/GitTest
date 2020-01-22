package com.number;

import java.util.Scanner;

public class DecimalToAny 
{
    public static String decimalToAny(int num,int ns)
    {
    	String str="";
    	String s1="0123456789ABCDEF";
    	while(num!=0)
    	{
    		int rem=num%ns;
    		str=s1.charAt(rem)+str;
    		num=num/ns;
    	}
    	return str;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int num=sc.nextInt();
		System.out.println("Enter Number System");
		int ns=sc.nextInt();
		String eqi=decimalToAny(num, ns);
		System.out.println("Equivalent of"+num+" number sytem"+ns+"="+eqi);
	}
}
