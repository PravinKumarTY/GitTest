package com.twodarray;

import java.util.Scanner;

public class FindMaxChar {
    public static void countMaxChar(String s1)
    {
    	char ch[]=s1.toCharArray();
    	int max=0;
    	char ch1=0;
    	for(int i=0; i<ch.length-1; i++)
    	{
    		int count=1;
    		while(i<ch.length-1&&ch[i]==ch[i+1])
    		{
    			count++;
    			i++;
    		}
    		if(count>max)
    		{
    			max=count;
    			ch1=ch[i];
    		}
    	}
    	System.out.println(ch1+" "+max);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		countMaxChar(str);
	}

}
