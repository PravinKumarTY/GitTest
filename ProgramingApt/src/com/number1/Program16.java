package com.number1;

import java.util.Scanner;

public class Program16 {
	public static int noOfDigit(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static int pow(int num,int pow)
	{
		int res=1;
		for (int i = 0; i <pow; i++) {
			res=res*num;
		}
		return res;
	}
	public static boolean isArmStrong(int num)
	{
		int count=noOfDigit(num);
		int tem=num;
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			res=res+pow(rem, count);
			num=num/10;
		}
		return ((tem==res)?true:false);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		boolean b1=isArmStrong(n);
		System.out.println(b1?" ArmStrong Number":"Not ArmStrong Number");
	}

}
