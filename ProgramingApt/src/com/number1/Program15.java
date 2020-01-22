package com.number1;

import java.util.Scanner;

public class Program15 
{
    public static boolean isPerfect(int num)
    {
    	int res=0;
    	for(int i=1; i<=num/2; i++)
    	{
    		if(num%i==0)
    		{
    			res=res+i;
    		}
    	}
    	return ((num==res)?true:false);
    }
	public static void main(String[] args)
	{
       /*Scanner sc=new Scanner(System.in);
       System.out.println("Enter number to check:");
       int num=sc.nextInt();
       boolean b=isPerfect(num);
       System.out.println(b?"Perfect Number":"Not a perfect Number"); */
		String str="";
		for (int i = 1; i <1000; i++) {
			boolean b1=isPerfect(i);
			if(b1==true)
			{
				str=str+" "+i;
			}
		}
		System.out.println("List of perfect Numbers:"+str);
	}
}
