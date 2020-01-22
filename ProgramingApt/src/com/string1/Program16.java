package com.string1;

import java.util.Scanner;

public class Program16 {
    public static String revOdd(String s1)
    {
    	String str="";
    	char ch[]=s1.toCharArray();
    	String ch1[]=new String[ch.length];
    	int count=0;
    	for (int i = 0; i < ch.length; i++) {
    		String rs="";
			int start=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				rs=rs+ch[i];
				i++;
			}
		   ch1[count++]=rs;
		}
    	for (int i = 0; i <count-2; i++) {
			if(i%2!=0)
			{
				String temp=ch1[i];
				ch1[i]=ch1[i+2];
				ch1[i+2]=temp;
			}
		}
    	for (int i = 0; i <count; i++) {
			str=str+" "+ch1[i];
		}
    	return str;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String:");
	    String str1=sc.nextLine();
	    String res=revOdd(str1);
	    System.out.println(res);
	}
}
