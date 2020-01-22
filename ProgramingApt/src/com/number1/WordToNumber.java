package com.number1;

import java.util.Scanner;

public class WordToNumber {
	static int rs;
	//karthikganesh17@gmail.com
    public static int toNumber(String str)
    {
    	switch (str) {
		case "one":
			rs=1;
			break;
		case "two":
			rs=2;
			break;
		case "three":
			rs=3;
            break;
		case "four":
			rs=4;
			break;
		case "five":
			rs=5;
			break;
		case "six" :
		    rs=6;
		    break;
		case "seven":
			rs=7;
			break;
		case "eight":
			rs=8;
			break;
		case "nine":
			rs=9;
			break;
		case "ten":
			rs=10;
			break;
		case "eleven":
			rs=11;
			break;
		case "twelve":
			rs=12;
			break;
		case "thirteen":
			rs=13;
			break;
		case "fourteen":
			rs=14;
			break;
		case "fifteen":
			rs=15;
			break;
		case "sixteen":
			rs=16;
			break;
		case "seventeen":
			rs=17;
			break;
		case "eighteen":
			rs=18;
			break;
		case "ninteen":
			rs=19;
			break;
		case "twenty":
			rs=20;
			break;
		case "thirty":
			rs=30;
			break;
		case "fourty":
			rs=40;
			break;
		case "fifty":
			rs=50;
			break;
		case "sixty":
			rs=60;
			break;
		case "seventy":
			rs=70;
			break;
		case "eigthty":
			rs=80;
			break;
		case "ninty":
			rs=90;
			break;
		case "thousand":
			rs=1000;
			break;
		case "hundred":
			rs=100;
			break;
		default:
			System.out.println("Invalid request:");
			break;
		}
    	return rs;       	    
    }
	public static void sepword(String str)
	{
		int res=0;
		String s1[]=str.split(" ");
		int i=0;
		while(i<s1.length)
		{
			int res1=toNumber(s1[i]);
			if(res1==1000)
			{
				res=res*1000;
			}
			else if(res1==100)
			{
				res=res*100;
			}
			else
			{
				res=res+res1;
			}
			i++;
		}
		//res=res-1;
		System.out.println("Result="+res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number in Word");
        String word=sc.nextLine();
        sepword(word);
	}
}
