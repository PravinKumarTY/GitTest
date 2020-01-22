package com.number1;

import java.util.Scanner;

public class Program19 {
	public static void fibbo(int count)
	{
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		while(count>2)
		{
			int n3=n1+n2;
			//System.out.println(n1);
			n1=n2;
			n2=n3;
			System.out.println(n3);
			count--;
		}
	}
	/*public static void fibo(int num1,int num2,int count)
	{
		if(count>0)
		{
			int num3=num1+num2;
			System.out.print(num1+" ");
			fibo(num2,num3,--count);
		}
	}*/
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int num=sc.nextInt();
      //fibo(0,1,num);
      fibbo(num);
	}

}
