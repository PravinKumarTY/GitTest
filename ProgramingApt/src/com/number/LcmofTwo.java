package com.number;

import java.util.Scanner;

public class LcmofTwo 
{
	public static void lcmOfTwo(int n1,int n2)
	{
		int max=n1>n2?n1:n2;
		int c=max;
		while(true)
		{
			if(max%n1==0&&max%n2==0)
			{
				System.out.println("LCM of "+n1+" and "+n2+" is= "+max);
				break;
			}
			max+=c;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second Number:");
		int num2=sc.nextInt();
		lcmOfTwo(num1, num2);
	}
}
