package com.pattern;

import java.util.Scanner;

public class Pattrern8 {
	public static void shoe(String str)
	{
		int len=str.length();
		//char ch[]=str.toCharArray();
		for (int i = 0; i <len; i++) 
		{
			for (int j = 0; j <=i; j++)
			{
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value:-");
		String s1=sc.next();
		shoe(s1);
		
	}

}