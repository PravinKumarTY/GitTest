package com.number1;

import java.util.Scanner;

public class Program20 {
    public static boolean isPalindrom(int a)
    {
    	int b=a;
    	int d=0;
    	while(a!=0)
    	{
    		int rem=a%10;
    		d=d*10+rem;
    		a=a/10;
    	}
    	return b==d?true:false;
    }
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int num=sc.nextInt();
      boolean b1=isPalindrom(num);
      System.out.println(b1?"Palindrom Number":"Not a Palindrom Number");
	}
}
