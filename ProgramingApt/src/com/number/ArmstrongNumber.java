package com.number;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static int noOfDigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public static boolean isArmStrong(int num,int count)
	{
		int t=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+pow(rem,count);
			num=num/10;
		}
		return (t==sum)? true:false;	
	}
	public static int pow(int num,int pwr)
	{
		int res=1;
		for(int i=0; i<pwr; i++)
		{
			res=res*num;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int n=sc.nextInt();
		int a=noOfDigits(n);
		boolean b=isArmStrong(n, a);
		System.out.println((b)?"armstrong no":"not armstrong no");
	}

}
