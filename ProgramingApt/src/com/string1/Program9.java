package com.string1;

import java.util.Scanner;

public class Program9 {
	public static void deleteDuplicate(String s1)
	{
		String str="";
		char ch[]=s1.toCharArray();
		int len=ch.length;
		for (int i = 0; i < len-1; i++) {
			for (int j =i+1; j <len; j++) {
				if(ch[i]==ch[j])
				{
					int k=j;
					while(k<len)
					{
						ch[k]=ch[k+1];
						k++;
					}
					j--;
					len--;
				}
				str=str+ch[j];
			}
		}	
		System.out.println("Result:"+str);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		deleteDuplicate(str);
		//System.out.println("Resultant String:"+res);
	}
}
