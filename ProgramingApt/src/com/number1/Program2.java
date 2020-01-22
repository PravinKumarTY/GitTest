package com.number1;

import java.util.Scanner;

public class Program2 
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
			num=num/10;
			count=count*2;
		}
		return res;
	}
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter A Number:");
       int a=sc.nextInt();
       boolean b1=isBoolean(a);
       if(b1==true)
       {
         int b=binaryToDecimal(a);
         System.out.println("Decimal ="+b+" of ="+a);
       }
       else
       {
    	   System.out.println("Invalid Number");
       }
      // System.out.println(0b1010);
	}
}
