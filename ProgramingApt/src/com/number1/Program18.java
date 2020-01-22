package com.number1;

import java.util.Scanner;

public class Program18 {
    public static void isLCM(int a,int b)
    {
    	int max=a>b?a:b;
    	int c=max;
    	while(true)
    	{
    		if(max%a==0&&max%b==0)
    		{
    			System.out.println("Lcm of "+a+",and "+b+"is ="+max);
    			break;
    		}
    		max=max+c;
    	}
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x1=sc.nextInt();
        System.out.println("Enter the second number:");
        int y1=sc.nextInt();
        isLCM(x1, y1);
	}
}
