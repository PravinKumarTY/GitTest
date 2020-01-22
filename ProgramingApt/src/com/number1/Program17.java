package com.number1;

import java.util.Scanner;

public class Program17 {
	public static void isPrime(int num)
	{
		int find=0;
		int sum=0;
		int count=0;
		for (int i = 2; i <=num/2; i++) {
			if(num%i==0)
			{
				find=1;
				break;
			}
		}
		if(find==0&&num!=1&&count<10)
		{
			System.out.println(num+" this is prime number");
			sum=sum+num;
			count++;
		}
		System.out.println("sum of prime Number="+sum);
		
	}
	/*public static boolean isPrime(int num)
	{
		for (int i = 2; i <=num/2; i++) {
			if(num%i==0&&num==1)
			{
				return false;
			}
		}
		return true;
	}*/
	public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();*/
		String str="";
		int sum=0;
		for (int i = 1; i <1000; i++) {
			isPrime(i);
		}
        //boolean b1=isPrime(num);
        System.out.println(str);
        //System.out.println(sum);
	}

}
