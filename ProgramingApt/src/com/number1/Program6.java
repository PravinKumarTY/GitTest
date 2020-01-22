package com.number1;

import java.util.Scanner;

public class Program6
{
    public static int hexaToDeci(String s1)
    {
    	int len=s1.length()-1;
    	int res=0;
    	int count=1;
    	while(len>=0)
    	{
    		char c=s1.charAt(len);
    		if(c>=97&&c<=102)
    		{
    			res=res+(c-87)*count;
    		}
    		else if(c>=65&&c<=70)
    		{
    			res=res+(c-55)*count;
    		}
    		else if(c>=48&&c<=57)
    		{
    			res=res+(c-48)*count;
    		}
    		else
    		{
    			System.out.println("Invalid Number");
    			return 0;
    		}
    		len--;
    		count=count*16;
    	}
    	return res;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		String str=sc.next();
		int deci=hexaToDeci(str);
		System.out.println("Decimal="+deci+" of="+str);
		//System.out.println(0x123A);
	}
}
