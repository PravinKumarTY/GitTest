package com.string;

import java.util.Scanner;

/* Write a program to count occurrence of another string in one string*/
public class CountOccurenceOfWord {
    public static int count(String s1,String s2)
    {
    	char c1[]=s1.toCharArray();
    	char c2[]=s2.toCharArray();
    	int count=0;
    	for (int i = 0; i < c1.length; i++) {
			int j=0;
			int n=i;
			while(j<c2.length&&n<c1.length&&c1[n]==c2[j])
			{
				j++;
				n++;
			}
			if(j==c2.length)
			{
				count++;
			}
		}
    	return count;
    }
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first string");
       String s1=sc.nextLine();
       System.out.println("Enter the second string:");
       String s2=sc.next();
       int c=count(s1, s2);
       System.out.println("String "+s2+" present"+c+"times");
	}
}
