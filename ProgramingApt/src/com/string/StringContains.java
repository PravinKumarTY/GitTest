package com.string;
/*Write a program to check whether a string present in another string or not*/
import java.util.Scanner;

public class StringContains {
	public static boolean strContains(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int j=0;
			int n=i;
			while(n<c1.length&&j<c2.length&&c1[n]==c2[j])
			{
				n++;
				j++;
			}
			if(j==c2.length)
			{
				//System.out.println("yes");
				return true;
				//break;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1=sc.nextLine();
		System.out.println("Enter the second String");
		String s2=sc.nextLine();
        boolean b1=strContains(s1 ,s2);
        System.out.println(b1?"String s2 contains String s1":"String s2 does not contains string s1");
	}

}
