package com.string;

import java.util.Scanner;

public class WordCount 
{
    public static int wordCount(String str)
    {
    	char ch[]=str.toCharArray();
    	int count=1;
    	if(ch[0]==' ')
    	{
    		count=0;
    	}
    	for (int i = 0; i <ch.length-1; i++)
    	{
			if(ch[i]==' '&&ch[i+1]!=' ')
			{
				count++;
			}
		}
    	return count;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.nextLine();
		System.out.println(s1);
		int count=wordCount(s1);
		System.out.println(count);
	}
}
