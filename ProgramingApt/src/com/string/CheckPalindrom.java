package com.string;
/*Write a Program to check whether string is palindrom or not*/ 
import java.util.Scanner;

public class CheckPalindrom {
    public static boolean isBoolean(String s1)
    {
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length/2; i++) {
			if(ch[i]!=ch[ch.length-1-i])
			{
				return false;
			}
		}
    	return true;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s1=sc.next();
    boolean b1=isBoolean(s1);
    System.out.println("String "+s1+" is palindrom");
	}

}
