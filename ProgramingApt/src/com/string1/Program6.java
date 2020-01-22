package com.string1;

import java.util.Scanner;

public class Program6 {
    public static String removeSpace(String s1)
    {
    	String str="";
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
			{
				str=str+ch[i];
			}
		}
    	return str;
    }
    public static String toUpperCase(String s1)
    {
    	String str="";
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97&&ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
			str=str+ch[i];
		}
    	return str;
    }
    public static String toSort(String s1)
    {
    	String str="";
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length-1; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			str=str+ch[i];
		}
    	return str;
    }
    public static boolean toCheck(String s1,String s2)
    {
    	char ch1[]=s1.toCharArray();
    	char ch2[]=s2.toCharArray();
    	for (int i = 0; i < ch1.length; i++) {
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String strIn1=sc.nextLine();
		System.out.println("Enter the second string");
		String strIn2=sc.nextLine();
		String strRes1=removeSpace(strIn1);
		String strRes2=removeSpace(strIn2);
		if(strRes1.length()!=strRes2.length())
		{
			System.out.println("Strings are not anagram");
		}
		else
		{
			String strUpp1=toUpperCase(strRes1);
			String strUpp2=toUpperCase(strRes2);
			String strSort1=toSort(strUpp1);
			String strSort2=toSort(strUpp2);
			boolean isAna=toCheck(strSort1, strSort2);
			System.out.println(isAna?"Two Strings are Anagram":"Two Strings are Not Anagram");
		}
	}

}
