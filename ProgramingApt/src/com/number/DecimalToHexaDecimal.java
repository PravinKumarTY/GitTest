package com.number;

import java.util.Scanner;

public class DecimalToHexaDecimal
{
    public static String decimalToHexa(int num)
    {
    	String str="";
    	while(num!=0)
    	{
    		int rem=num%16;
    		switch (rem) 
    		{
			case 10:
				str='A'+str;
				break;
			case 11:
				str='B'+str;
				break;
			case 12:
				str='C'+str;
				break;
			case 13:
				str='D'+str;
			    break;
			case 14:
				str='E'+str;
				break;
			case 15:
				str='F'+str;
                break;
			default:
				str=rem+str;
				break;
			}
    		num=num/16;
    	}
    	return str;
    }
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number:-");
       int num=sc.nextInt();
       String s1=decimalToHexa(num);
       System.out.println("Decimal of"+num+" is="+s1);
	}
}
