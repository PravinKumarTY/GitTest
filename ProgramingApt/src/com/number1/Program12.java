package com.number1;

import java.util.Scanner;

public class Program12 {
	public static String toAny(int num,int ns)
	{
		String out="";
		String s1="0123456789ABCDEF";
		while(num!=0)
		{
			int rem=num%ns;
			out=s1.charAt(rem)+out;
			num=num/ns;
		}
		return out;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal:");
		int num=sc.nextInt();
		System.out.println("Enter the number system to convert:");
		int ns=sc.nextInt();
		String str=toAny(num, ns);
		System.out.println("Equivalent of "+num+"="+str);
	}

}
