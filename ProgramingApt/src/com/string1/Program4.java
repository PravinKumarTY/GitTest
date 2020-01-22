package com.string1;

import java.util.Scanner;

public class Program4 {
    public static String reverseWord(String str)
    {
    	String rev="";
    	char ch[]=str.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			int start=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int end=i-1;
			while(end>=start)
			{
				rev=rev+ch[end];
				end--;
			}
			rev=rev+" ";
		}
    	return rev;
    }
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String :");
      String s1=sc.nextLine();
      String res=reverseWord(s1);
      System.out.println("Result String:"+res);
	}
}
