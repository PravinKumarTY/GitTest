package com.string1;

import java.util.Scanner;

public class Program3 {
    public static int noOfWord(String s1)
    {
    	int count=1;
    	char ch[]=s1.toCharArray();
    	if(ch.length==0)
    	{
    		return 0;
    	}
    	else if(ch[0]==' ')
    	{
    		count=0;
    	}
    	   for (int i = 0; i < ch.length-1; i++) {
				if(ch[i]!=' '&&ch[i+1]==' ')
				{
					count++;
				}
			}
    		return count;
    	
    }
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String:");
      String str=sc.nextLine();
      int res=noOfWord(str);
      System.out.println("Total Number Of words:"+res);
	}

}
