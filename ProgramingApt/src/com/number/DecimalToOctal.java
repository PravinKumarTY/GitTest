package com.number;

import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class DecimalToOctal 
{
    public static String decimalToOctal(int num)
    {
    	String str="";
    	while(num!=0)
    	{
    		int rem=num%8;
    		str=rem+str;
    		num=num/8;
    	}
       return str;		
    }
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number:-");
       int num=sc.nextInt();
       String s1=decimalToOctal(num);
       System.out.println("Octal of"+num+ "is ="+s1);
       System.out.println(055);
	}
}
