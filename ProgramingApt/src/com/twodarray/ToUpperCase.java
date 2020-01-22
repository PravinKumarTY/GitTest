package com.twodarray;

import java.util.Scanner;

public class ToUpperCase {
    public static void toUpperCase(String s1)
    {
    	String str1="";
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97&&ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
				str1=str1+ch[i];
			}
		}
    	System.out.println("Resulttant String:"+str1);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		toUpperCase(str);
	}
}
