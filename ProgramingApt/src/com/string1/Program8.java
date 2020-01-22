package com.string1;

import java.util.Scanner;

public class Program8 {
    public static String countWord(String s1)
    {
    	String str="";
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			int count=0;
			int start=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
				count++;
			}
			int end=i-1;
			while(start<=end)
			{
				str=str+ch[start];
				start++;
			}
			str=str+" "+count;
		}
    	return str;
    }
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String:");
       String strIn=sc.nextLine();
       String strRes=countWord(strIn);
       System.out.println("Requared String:"+strRes);
	}
}
