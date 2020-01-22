package com.number;

import java.util.Scanner;

public class DevisionWithoutOperator 
{
    public static double devision(int a,int b)
    {
    	int result=0;
    	while(a>=b)
    	{
    		a=a-b;
    		result++;
    	}
    	return result;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:-");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:-");
		int b=sc.nextInt();
		double d=devision(a, b);
		System.out.println("Devision of"+a+"and"+b+"is ="+d);
	}
}
