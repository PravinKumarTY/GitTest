package com.string;

import java.util.Scanner;

public class Split {
	static int count=0;
    public static String[] split(String s1,char c)
    {
    	String str[]=new String[10];
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			String res="";
			while(i<ch.length&&ch[i]!=c)
			{
				res=res+ch[i];
				i++;
			}
			str[count++]=res;
		}
    	return str;
    }
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String s1=sc.nextLine();
	 System.out.println("Enter the second string");
	 String s2=sc.next();
	 String str1[]=split(s1, s2.charAt(0));
	 for (int i = 0; i <count; i++) {
		System.out.println(str1[i]+" ");
	}
  }
}
