package com.string;

import java.util.Scanner;

public class RevFLCharOfWord {
    public static String rev(String str)
    {
    	String st="";
    	char ch[]=str.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			int start=i;
			char c1=ch[start];
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int end=i-1;
			//char c2=ch[end];
			ch[start]=ch[end];
			ch[end]=c1;
		}
    	for (int i = 0; i < ch.length; i++) {
			st=st+ch[i];
		}
    	return st;
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String s1=sc.nextLine();
    String str=rev(s1);
    System.out.println("Resultant String"+str);
	}

}
