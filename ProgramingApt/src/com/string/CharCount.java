package com.string;

import java.util.Scanner;

public class CharCount {
	public static String count(String s1)
	{
		String res="";
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			while(i<ch.length&&ch[i]!=' ')
			{
				count++;
				res=res+ch[i];
				i++;
			}
			res=res+" "+count;
			
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
        String str=sc.nextLine();
        String s1=count(str);
        System.out.println(" "+s1);
	}

}
