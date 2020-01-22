package com.string;
//input:-this is a string
//output:-a is this string
import java.util.Scanner;

public class ExchangeEvenWord {
    public static void exchangeWord(String s1) {
    	String str[]=new String[s1.length()];
    	int count=0;
    	char ch[]=s1.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			String str1="";
			while(i<ch.length&&ch[i]!=' ')
			{
				str1=str1+ch[i];
				i++;
			}
			str[count++]=str1;
		}
    	for (int i = 0; i <count; i++) {
			if(i%2==0)
			{
				String temp=str[i];
				str[i]=str[count-2];
				str[count-2]=temp;
			}
		}
    	for (int i = 0; i < count; i++) {
			System.out.print(str[i]+" ");
		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String src=sc.nextLine();
		exchangeWord(src);
	}

}
