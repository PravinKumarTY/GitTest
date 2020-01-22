package com.triangle;

public class Assignment1 {

	public static void main(String[] args) 
	{
        for(int i=0; i<3; i++)
        {
        	for(int j=0; j<=i; j++)
        	{
        		System.out.print("  *");
        	}
        	System.out.println();
        }
        for(int i=0; i<2; i++)
        {
        	for(int j=0; i+j<=1; j++)
        	{
        		System.out.print("  *");
        	}
        	System.out.println();
        }
	}

}
