package com.string1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Program14 {
    public static String reverse(String s1)
    {
    	String res="";
    	char ch[]=s1.toCharArray();
    	for(int i=0; i<ch.length; i++)
    	{
    		int start=i;
    		char c1=ch[start];
    		while(i<ch.length&&ch[i]!=' ')
    		{
    			i++;
    		}
    		int end=i-1;
    		char c2=ch[end];
    		ch[start]=c2;
    		ch[end]=c1;
    	}
    	for (int i = 0; i < ch.length; i++) {
			res=res+ch[i];
		}
    	return res;
    }
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the first string:");
	       String str1=sc.nextLine();
	       String res=reverse(str1);
	       System.out.println("Resultant String:"+res);
	}

}
