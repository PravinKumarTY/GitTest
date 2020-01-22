package com.string1;

import java.util.Scanner;

public class StringEquals {
    public static boolean isEquals(String s1,String s2)
    {
    	char ch1[]=s1.toCharArray();
    	char ch2[]=s2.toCharArray();
    	int flag=0;
    	if(ch1.length!=ch2.length)
    	{
    		return false;
    	}
    	else
    	{
    		for (int i = 0; i < ch1.length; i++) {
				if(ch1[i]==ch2[i])
				{
					flag=0;
				}
				else
				{
					flag=1;
					break;
				}
			}
    		if(flag==0)
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    }
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string1:");
     String str1=sc.next();
     System.out.println("Enter the string2");
     String str2=sc.next();
     boolean b1=isEquals(str1,str2);
     System.out.println(b1?"Strings are equal":"Strings are not equal");
	}
}
