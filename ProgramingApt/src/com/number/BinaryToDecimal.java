package com.number;

import java.util.Scanner;

public class BinaryToDecimal
{
	/*public static int pow(int num,int pwr)
	{
		int res=1;
		for(int i=0; i<pwr; i++)
		{
		res=res*num;
		}
		return res;
	}*/
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
	  int count=1; //count=0;
	  while(num!=0)
	  {
		  int rem=num%10;
		  //res=res+rem*pow(2,count++);
		  res=res+rem*count;
		  count=count*2;
		  num=num/10;
	  }
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int bin=sc.nextInt();
		boolean b=isBoolean(bin);
	    if(b==true)
	    {
	    	int dec=binaryToDecimal(bin);
	    	System.out.println("Decimal of"+bin+"is="+dec);
	    }
	    else
	    {
	    	System.out.println("Invalid Number");
	    	System.out.println("Try with another number");
	    }
	}

}
