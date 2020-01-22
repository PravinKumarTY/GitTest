package com.string;

import java.util.Scanner;

public class CountAllCaseType {
	public static void  countAllCase(String s1) {
		char ch[]=s1.toCharArray();
		int countUp=0;
		int countLow=0;
		int countNum=0;
		int countSpe=0;
		for (int i = 0; i <ch.length; i++) {
			if(ch[i]>=97&&ch[i]<=122)
			{
				countLow++;
			}
			else if (ch[i]>=65&&ch[i]<=90) {
				countUp++;
			}
			else if (ch[i]>=48&&ch[i]<=57){
				countNum++;
			}
			else {
				countSpe++;
			}
		}
		System.out.println("The lower case letter present"+countLow+"times");
		System.out.println("The Upper case letter present"+countUp+"times");
		System.out.println("The Numeric letter present"+countNum+"times");
		System.out.println("The special case letter present"+countSpe+"times");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the stirng");
		String str=sc.nextLine();
		countAllCase(str);
	}

}
