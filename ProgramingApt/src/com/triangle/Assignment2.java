package com.triangle;

public class Assignment2 
{

	public static void main(String[] args)
	{
        for (int i = 0; i <3; i++) 
        {
        	for (int j = 0; j <3; j++)
        	{
				if(i<=j)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
        	System.out.println();
		}
        for(int i=1; i<3; i++)
        {
        	for(int j=0; j<3; j++)
        	{
        		if(i+j>=2)
        		{
        			System.out.print(" *");
        		}
        		else
        		{
        			System.out.print("  ");
        		}
        	}
        	System.out.println();
        }
	}

}
