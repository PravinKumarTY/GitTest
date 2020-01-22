package com.string;

import java.util.Scanner;
//input:-this is a string
//output:-this string a is 
public class ReverseOddWord {
	public static void revOddWord(String str){
		String[]str1=new String[str.length()];
		int count=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s1="";
		    	while(i<ch.length&&ch[i]!=' ')
				{
		    		s1=s1+ch[i];
		    		i++;
				}
		    	str1[count++]=s1;
		}
		for (int i = 0; i <count; i++) {
			if(i%2!=0)
			{
				String temp=str1[i];
				str1[i]=str1[count-1];
				str1[count-1]=temp;
			}
		}
		for (int i = 0; i <count; i++) {
			System.out.print(str1[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		revOddWord(s1);
	}

}
