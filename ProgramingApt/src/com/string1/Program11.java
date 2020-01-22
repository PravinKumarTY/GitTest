package com.string1;

import java.util.Scanner;

public class Program11 {
    public static boolean check(String s1,String s2)
    {
    	char ch1[]=s1.toCharArray();
    	char ch2[]=s2.toCharArray();
    	int flag=0;
    	for (int i = 0; i < ch1.length; i++) {
			int j=0;
			while(j<ch2.length&&i<ch1.length&&ch2[j]==ch1[i])
			{
				i++;
				j++;
				if(j==ch2.length)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
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
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first string:");
       String str1=sc.nextLine();
       System.out.println("Enter the second string:");
       String str2=sc.nextLine();
       boolean b1=check(str1,str2);
       System.out.println(b1?"String2 is present in String1":"String2 is not present in String1");
	}
}
