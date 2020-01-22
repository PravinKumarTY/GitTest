package com.number;

import java.util.Scanner;

public class Prime 
{
	static int count=0;
	static int sum=0;
   /* public static void isPrime(int n)
    {
    	int find=0;
    	for(int i=2; i<=n/2; i++)
    	{
    		if(n%i==0)
    		{
    			find=1;
    			break;
    		}
    	}
    	if(find==0&&n!=1&&count<10)
    	{
    		System.out.print("\t"+n);
    		count++;
    		sum=sum+n;
    	}
    }*/
	public static boolean isPrime1(int num)
	{
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number");
       int n=sc.nextInt();
      /* System.out.println("All the Prime Numbers Are");
       for (int i = 1; i <=n; i++)
       {
    	   isPrime(i);
	   }
       System.out.println();
       System.out.println("Sum of Numbers:"+sum);*/
       String str="";
       for (int i = 2; i <=n ; i++) 
       {
		  boolean b=isPrime1(i);
		  if(b==true&&count<10)
		  {
			  str=str+" "+i;
			  count++;
			  sum=sum+i;
		  }
	   } 
       System.out.println("Prime Numbers:"+str);
       System.out.println("Sum of 1st 10 numnber="+sum);
	}

}
