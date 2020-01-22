package com.pattern1;

public class Program4 
{
	public static void main(String[] args) 
	{
		int num1=415;
		int num2=714;
		int num3=1111;
		String res=(num1>num2&&num1>num3)?"num1 is max":(num2>num3)?"num2 is max":"num3 is max";
		System.out.println("Result="+res);
	}
}
