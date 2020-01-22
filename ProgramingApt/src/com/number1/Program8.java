package com.number1;

import java.util.Scanner;

public class Program8
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
    public static String binaryToHexa(int num)
    {
    	int dec=binToDec(num);
    	String s1="0123456789ABCDEF";
    	String str="";
    	while(dec!=0)
    	{
    		int rem=dec%16;
    		str=s1.charAt(rem)+str;
    		dec=dec/10;	
    	}
    	return str;
    }
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Binary Number:");
       int bin=sc.nextInt();
       String hexa=binaryToHexa(bin);
       System.out.println("Hexa Decimal="+hexa+" of="+bin);
	}
}
