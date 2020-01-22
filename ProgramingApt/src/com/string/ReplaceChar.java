package com.string;

import java.util.Scanner;

public class ReplaceChar {
	public static String replace(String s1)
	{
		String str="";
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case 'a':str=str+'$';
			break;
			case 'e':str=str+'@';
			break;
			case 'i':str=str+'-';
			break;
			case 'o':str=str+'!';
			break;
			case 'u':str=str+'%';
			break;
			default:str=str+ch[i];
				break;
			}
		}
		return str;
	}
	public static void main(String[] args) {
       String str="hello";
       String s=replace(str);
       System.out.println(s);
	}

}
