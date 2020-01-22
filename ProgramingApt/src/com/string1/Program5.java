package com.string1;

import java.util.Scanner;

public class Program5 {
    public static String reverseString(String str)
    {
    	String rev="";
    	char ch[]=str.toCharArray();
    	for (int i =ch.length-1; i>=0; i--) {
			int start=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int end=i+1;
			while(end<=start)
			{
				rev=rev+str.charAt(end);
				end++;
			}
			rev=rev+" ";
		}
    	return rev;
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        String res=reverseString(str);
        System.out.println("Resulttant String:"+res);
	}
}
