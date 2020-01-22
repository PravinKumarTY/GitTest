package com.number;

import java.util.Scanner;

public class MultiplicationWithoutOprator 
{
    public static int multiPly(int a,int b)
    {
    	int result=0;
    	for (int i = 0; i <b; i++) 
    	{
			result=result+a;
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
		int value=multiPly(a, b);
		System.out.println("Multiplication of \t"+a+" and\t"+b+"is ="+value);
	}
}
