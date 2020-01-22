package com.number1;

import java.util.Scanner;

public class Program4
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
			num=num/10;
			count=count*8;
		}
		return res;
	}
	public static void main(String[] args)
	{
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number:");
         int a=sc.nextInt();
         boolean b1=isOctal(a);
         if(b1==true)
         {
             int dec=octalToDecimal(a);
             System.out.println("Decimal ="+dec+" of="+a);
         }
         else
         {
        	 System.out.println("Invalid Number:");
         }
	}
}
