package com.string1;

import java.util.Scanner;

public class Program12 {
    public static void count(String s1,String s2)
    {
    	int ct=0;
    	char ch1[]=s1.toCharArray();
    	char ch2[]=s2.toCharArray();
    	for (int i = 0; i < ch1.length; i++) {
			int j=0;
			int n=i;
			while(j<ch2.length&&n<ch1.length&&ch1[n]==ch2[j])
			{
				n++;
				j++;
			}
			if(j==ch2.length)
			{	
				ct++;
				System.out.println(s2+"is present "+ct+" times in between"+(n-j)+"and"+(n-1));
			}
		}
    	//return ct;
    }
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the first string:");
	       String str1=sc.nextLine();
	       System.out.println("Enter the second string:");
	       String str2=sc.nextLine();
	       count(str1,str2);
	       //System.out.println(b1);
	}

}
