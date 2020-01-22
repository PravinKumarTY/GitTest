package com.number;

import java.util.Scanner;

public class OctalToHexadecimal 
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
		return true;
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
	public static String hexaDecimal(int num)
	{
		String str1="";
		String str2="0123456789ABCDEF";
		while(num!=0)
		{
			int rem=num%16;
			str1=str2.charAt(rem)+str1;
			num=num/16;
		}
		return str1;
	}
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Octal Number:-");
       int o=sc.nextInt();
       boolean b=isOctal(o);
       if(b==true)
       {
    	   int oct=octalToDecimal(o);
    	   String hexa=hexaDecimal(oct);
    	   System.out.println("Equivalent hexadecimal of"+oct+"is="+hexa);
       }
       else
       {
    	   System.out.println("Not a Octal Number:-");
    	   System.out.println("Try with another Number");
       }
	}

}
