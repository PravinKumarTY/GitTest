package com.string1;

import java.util.Scanner;

public class Program13 {
    public static boolean isPalindrom(String s1)
    {
    	char ch[]=s1.toCharArray();
    	for(int i=0;i<ch.length/2; i++)
    	{
    		if(ch[i]!=ch[ch.length-1-i])
    		{
    			return false;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the first string:");
	       String str1=sc.nextLine();
	       boolean b=isPalindrom(str1);
	       System.out.println(b?"String is palindrom":"String is not palindrom");
	}
}
