package com.number;

import java.util.Scanner;

public class PerfectNumber 
{
	public static boolean isPerfect(int num)
	{
		int sum=0;
		for (int i = 1; i <=num/2; i++) 
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return ((num==sum)?true:false);
	}

	public static void main(String[] args)
	{
		String str="";
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int a=sc.nextInt();*/
        for(int i=1; i<10000; i++)
        {
          boolean b=isPerfect(i);
           if(b==true)
        	  str=str+" "+i;
        }
        System.out.println("List of Perfect Number:"+str);
	}

}
