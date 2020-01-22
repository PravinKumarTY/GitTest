package com.string;

import java.util.Scanner;

public class ReverseStringNotWord 
{
	public static String reverseStringNoWord(String str)
	{
		String res="";
		char ch[]=str.toCharArray();
		for (int i =ch.length-1; i >=0; i--)
		{
			int start=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int end=i+1;
			while(end<=start)
			{
				res=res+ch[end];
				end++;
			}
			res=res+" ";
		}
		return res;
	}
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String :");
       String str=sc.nextLine();
       String s1=reverseStringNoWord(str);
       System.out.println(s1);
	}
}
