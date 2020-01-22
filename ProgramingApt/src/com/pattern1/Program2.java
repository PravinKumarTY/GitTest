package com.pattern1;

public class Program2 
{

	public static void main(String[] args) 
	{
		int num=21;
		String res=num%2==0?"Even Number":"Odd Number";
		System.out.println("Result="+res);
		int res1=(num%2==0)?100:200;
		System.out.println("Result1="+res1);
	}
}
