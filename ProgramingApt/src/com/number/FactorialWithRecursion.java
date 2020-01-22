package com.number;

public class FactorialWithRecursion
{
	static int fact=1;
    public static int isFact(int num)
    {
    	if(num>1)
    	{
    		fact=fact*num--;
    		isFact(num);
    	}
    	return fact;
    }
	public static void main(String[] args) 
	{
       int a=isFact(5);
       System.out.println("Factorial="+a);
	}
}
