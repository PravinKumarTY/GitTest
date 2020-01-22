package com.string;

import java.util.Scanner;

public class NumberToString {
	static String one[]= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	static String two[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
    public static void print(int n,String str)
    {
    	if(n<=19)
    	{
    		System.out.print(two[n]+" ");
    	}
    	else
    	{
    		System.out.print(one[n/10]+" ");
    		System.out.print(two[n%10]+" ");
    	}
    	if(n>0)
    	System.out.print(str+" ");
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		print(n/10000000,"crore");
		print((n/100000)%100,"lac");
		print((n/1000)%100,"thousand");
		print((n/100)%10,"hundred");
		print(n%100,"");
	}
}
