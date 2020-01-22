package com.number;

import java.util.Scanner;

public class HexaDecimalToDecimal 
{
    public static int hexaDecimalToDecimal(String str)
    {
    	int count=1;
    	int len=str.length()-1;
    	int res=0;
    	//char ch=str.charAt(len);
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
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter HexaDecimal Number:-");
		String s1=sc.next();
		int a=hexaDecimalToDecimal(s1);
		System.out.println("Equivalent hexadecimal of"+s1+"is="+a);
		System.out.println(0x5463a);
	}
}
