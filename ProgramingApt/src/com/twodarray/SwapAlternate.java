package com.twodarray;

import java.util.Scanner;
/*
 input:i come here to give programing test
 output:test come give to here programing i
 */
public class SwapAlternate {
    public static String swapAlternate(String s1)
    {
    	String []res=new String[s1.length()];
    	int c=0;
    	String strRes="";
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
    		String str="";
    		int start=i;
    		while(i<ch.length&&ch[i]!=' ')
    		{
    			i++;
    		}
    		int end=i-1;
    		while(start<=end)
    		{
    			str=str+ch[start];
    			start++;
    		}
    		res[c++]=str;
		}
    	for (int i = 0; i < c/2; i=i+2) {
			String t=res[i];
			res[i]=res[c-1-i];
			res[c-1-i]=t;
		}
    	for (int i = 0; i <c; i++) {
			strRes=strRes+" "+res[i];
		}
    	return strRes;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println(str);
		String result=swapAlternate(str);
		System.out.println(result);
	}

}
