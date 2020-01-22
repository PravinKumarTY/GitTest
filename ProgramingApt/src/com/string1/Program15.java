package com.string1;

import java.util.Scanner;

public class Program15 {
	static int count=0;
    public static String[] split(String s1,char c1)
    {
    	String str[]=new String[s1.length()];
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			String res="";
			while(i<ch.length&&ch[i]!=c1)
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
      System.out.println("Enter the String:");
      String str1=sc.nextLine();
      System.out.println("Enter the Second String:");
      String str2=sc.next();
      String s1[]=split(str1, str2.charAt(0));
      for (int i = 0; i <count; i++) {
		System.out.println("s1["+i+"]="+s1[i]);
	  }
	}
}
