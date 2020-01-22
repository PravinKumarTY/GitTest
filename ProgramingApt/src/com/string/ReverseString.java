package com.string;

import java.util.Scanner;

public class ReverseString 
{
	/*public static String reverseString(String str)
	{
		char ch[]=str.toCharArray();
		String str1="";
		for (int i =ch.length-1; i>=0; i--) 
		{
			str1=str1+ch[i];
		}
		return str1;
	}*/
	static String res="";
	static int start=0;
	public static String reverseString1(String str)
	{
		while(start<str.length())
		{
			res=res+str.charAt(str.length()-1-start);
			start++;
			reverseString1(str);
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		String strrev=reverseString1(str);
		System.out.println("Reverse of "+str+" is="+strrev);
	}
}
