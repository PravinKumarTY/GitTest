package com.number;

import java.util.Scanner;

public class Fibbonacci 
{
	/*public static void fibbo(int n1,int n2,int count)
	{
		//System.out.print(n1+" ");
		//System.out.print(n2+" ");
		/*while(count>=1)
		{
			int n3=n1+n2;
			System.out.print(n1+" ");
			n1=n2;
			n2=n3;
			//System.out.print(n1+" ");
			count--;
		}*/
		/*for (int i = 1; i <=count; i++)
		{
			int n3=n1+n2;
			System.out.print(n1+" ");
			n1=n2;
			n2=n3;
		}
	}*/
	//static int c=0;
	public static void isFibbo1(int num1,int num2,int count)
	{
		if(count>0)
		{
			int num3=num1+num2;
			System.out.print(num1+" ");
			isFibbo1(num2, num3, --count);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to Count:-");
		int c=sc.nextInt();
		isFibbo1(0, 1, c);
	}
}
