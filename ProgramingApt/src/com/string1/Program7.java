package com.string1;

import java.util.Scanner;

public class Program7 { 
	static String[]one= {"","","","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	static String[]two={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"
			,"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	public static void print(int num,String str)
	{
		if(num<=19)
		{
			System.out.print(" "+two[num]);
		}
		else
		{
			System.out.print(" "+one[num/10]+""+two[num%10]);
		}
		if(num>0)
			System.out.print(" "+str);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to conver:");
		int num=sc.nextInt();
		print(num/10000000, "crore");
		print((num/100000)%100,"lac");
		print((num/1000)%100,"thousand");
		print((num/100)%10,"hundred");
		print(num%100,"");
	}
}
