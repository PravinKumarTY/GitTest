package com.number1;

import java.util.Scanner;

public class Program9 
{
	public static boolean isOctal(int num)
	{
		while(num!=0)
		{
			int rem=num%10;
			if(rem>7)
			{
				return false;
			}
			num=num/10;
		}
		return  true;
	}
    public static int octalToDecimal(int num)
    {
    	int res=0;
    	int count=1;
    	while(num!=0)
    	{
    		int rem=num%10;
    		res=res+rem*count;
    		count=count*8;
    		num=num/10;
    	}
    	return res;
    }
    public static String toHexaDecimal(int num)
    {
    	String str="0123456789ABCDEF";
    	String s1="";
    	num=octalToDecimal(num);
    	while(num!=0)
    	{
    		int rem=num%16;
    		s1=str.charAt(rem)+s1;
    		num=num/10;
    	}
    	return s1;
    }
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter octal number:");
       int a=sc.nextInt();
       boolean b=isOctal(a);
       if(b==true)
       {
          String hexa=toHexaDecimal(a);
          System.out.println("HexaDecimal Number="+hexa);
       }
       else
       {
    	   System.out.println("Invalid Number:");
       }
	}
}
