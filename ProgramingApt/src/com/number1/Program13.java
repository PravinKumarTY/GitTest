package com.number1;

import java.util.Scanner;

public class Program13 
{
	/*static int f=1;
    public static int fact(int num)
    {
    	if(num>1)
    	{
    		f=f*num--;
    		fact(num);
    	}
    	return f;
    }*/
	public static int fact(int num)
	{
		int f=1;
		while(num>1)
		{
			f=f*num--;
		}
		return f;
	}
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr a number:");
       int num=sc.nextInt();
       int res=fact(num);
       System.out.println("Factorial of"+num+"is ="+res);
	}
}
