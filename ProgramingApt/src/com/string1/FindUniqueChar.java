package com.string1;

import java.util.Scanner;

public class FindUniqueChar {
    public static String findUnique(String s1,String s2)
    {
    	/*char ch1[]=s1.toCharArray();
    	char ch2[]=s2.toCharArray();
    	char ch3[]=new char[ch1.length];
    	int c=0;
    	int flag=0;
    	String res="";
    	for(int i=0; i<ch1.length; i++)
    	{
    		for(int j=0; j<ch2.length; j++)
    		{
    			if(ch1[i]!=ch2[j])
    			{
    				flag=0;
    				//break;
    			}
    			else
    			{
    				flag=1;
    				break;
    			}
    		}
    		if(flag==0)
    		{
    			ch3[c++]=ch1[i];
    		}
    	}
    	for(int i=0; i<c; i++)
    	{
    		res=res+ch3[i];
    	}
    	return res;*/
    	
    	char ch1[]=s1.toCharArray();
    	char ch2[]=s2.toCharArray();
    	char ch3[]=new char[ch1.length];
    	int c=0;
    	int flag=0;
    	String res="";
    	for(int i=0; i<ch1.length; i++)
    	{
    		for(int j=0; j<ch2.length; j++)
    		{
    			if(ch1[i]!=ch2[j])
    			{
    				flag=0;
    				//break;
    			}
    			else
    			{
    				flag=1;
    				break;
    			}
    		}
    		if(flag==0)
    		{
    			ch3[c++]=ch1[i];
    		}
    	}
    	for(int i=0; i<c; i++)
    	{
    		res=res+ch3[i];
    	}
    	return res;
    }
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter First String:");
       String str1=sc.next();
       System.out.println("Enter Second String:");
       String str2=sc.next();
       String res=findUnique(str1, str2);
       System.out.println(res);
	}
}
