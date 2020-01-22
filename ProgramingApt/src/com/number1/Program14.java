package com.number1;

import java.util.Scanner;

public class Program14 {
	public static int fact(int a)
	{
		int f=1;
		while(a>1)
		{
			f=f*a--;
		}
		return f;
	}
    public static boolean isStrong(int a1)
    {
       int temp=a1;
       int res=0;
       while(a1!=0)
       {
    	   int rem=a1%10;
    	   res=res+fact(rem);
    	   a1=a1/10;
       }
       return ((temp==res)?true:false);
    }
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		boolean b=isStrong(a);
		System.out.println(b?"Strong Number":"Not a strong Number");*/
		String st="";
		for (int i = 1; i <1000; i++) 
		{
			boolean b=isStrong(i);
			if((b==true))
			{
				st=st+" "+i;
			}
		}
		System.out.println("List of strong Number:"+st);
	}

}
