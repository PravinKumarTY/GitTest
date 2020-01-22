package com.string1;

import java.util.Scanner;

public class Program1 {
	/*public static String reverseString(String str)
	{
		String revStr="";
		for (int i =str.length()-1; i>=0; i--) {
			revStr=revStr+str.charAt(i);
		}
		return revStr;
	}*/
	static String rev="";
	static int start=0;
	public static String reverseString(String str)
	{
		
		if(start<str.length())
		{
			rev=rev+str.charAt(str.length()-1-start);
			start++;
			reverseString(str);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rhe String:");
        String s1=sc.next();
        String resStr=reverseString(s1);
        System.out.println("Resultant String:"+resStr);
	}
}
