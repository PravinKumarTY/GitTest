package com.twodarray;

import java.util.Scanner;

public class FindUnique {
    public static void unique(String str)
    {
    	char ch[]=str.toCharArray();
    	char ch1[]=new char[str.length()];
    	ch1[0]=ch[0];
    	int c=1;
    	int flag=0;
    	for (int i = 1; i <ch.length; i++) {
			for (int j =0; j < ch.length; j++) {
				if(i!=j)
				{
					if(ch[i]!=ch[j])
					{
						flag=0;
					}
					else
					{
						flag=1;
						break;
					}
				}
			}
			if(flag==0)
			{
				ch1[c++]=ch[i];
			}
		}
    	for (int i = 0; i < c; i++) {
			System.out.print(" "+ch1[i]);
		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
        String str=sc.nextLine();
        unique(str);
	}
}
