package com.string1;

import java.util.Scanner;

public class Program10 {
    public static String addNumberOfWord(String s1)
    {
    	char ch[]=s1.toCharArray();
    	String res="";
    	for (int i = 0; i < ch.length; i++) {
			int count=0;
			while(i<ch.length&&ch[i]!=' ')
			{
				if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122)
				{
					res=res+ch[i];
				}
				else if(ch[i]>=48&&ch[i]<=57)
				{
					count=count+(ch[i]-48);
				}
				i++;
			}
			res=" "+res+" "+count;
		}
    	return res;
    }
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String");
       String str=sc.nextLine();
       String strRes=addNumberOfWord(str);
       System.out.println("Resultant String:\t"+strRes);
	}
}
