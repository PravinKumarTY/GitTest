package com.string1;

import java.util.Scanner;

public class SumFromStringDigit {
    public static int sumDigitsInString(String s1)
    {
    	int sum=0;
    	for(int i=0; i<s1.length(); i++)
    	{
    		char c=s1.charAt(i);
    		if(c>=48&&c<=57)
    		{
    			sum=sum+(c-48);
    		}
    		
    	}
    	return sum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
        String str=sc.nextLine();
        int sum=sumDigitsInString(str);
        System.out.println("Result:"+sum);
	}
}
