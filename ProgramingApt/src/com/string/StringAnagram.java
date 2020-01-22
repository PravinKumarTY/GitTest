package com.string;

import java.util.Scanner;

public class StringAnagram 
{
	public static String removeSpaces(String str)
	{
		String res="";
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
			{
				res=res+ch[i];
			}
		}
		return res;
	}
	public static String toUpperCase(String str)
	{
		String s1="";
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>=97&&ch[i]<=122)
			{
				s1=s1+(char)(ch[i]-32);
			}
		}
		return s1;
	}
	public static String toShort(String str)
	{
		String str1="";
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length-1; i++)
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]>ch[j])
				{
					char c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
			str1=str1+ch[i];
		}
		return str1;
	}
	public static boolean compare(String s1,String s2)
	{
		for (int i = 0; i <s1.length(); i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1=sc.nextLine();
		System.out.println("Enter the second String");
		String s2=sc.nextLine();
		System.out.println("String s1="+s1);
		System.out.println("String s2="+s2);
		s1=removeSpaces(s1);
		s2=removeSpaces(s2);
		System.out.println("String after removing spaces:-");
		System.out.println("String s1="+s1);
		System.out.println("String s2="+s2);
		if(s1.length()!=s2.length())
		{
			System.out.println("String is not anagram");
		}
		s1=toUpperCase(s1);
		s2=toUpperCase(s2);
		System.out.println("String after converting to uppercase:");
		System.out.println("String s1="+s1);
		System.out.println("String s2="+s2);
		System.out.println("String after shorting:");
		s1=toShort(s1);
		s2=toShort(s2);
		System.out.println("String s1="+s1);
		System.out.println("String s2="+s2);
		System.out.println("After comparision:");
		boolean res=compare(s1, s2);
		System.out.println(res?"String is Anagram":"String is not Anagram");
	}
}
