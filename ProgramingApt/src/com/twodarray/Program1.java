package com.twodarray;

public class Program1 
{
	public static void main(String[] args) 
	{
		int ar[][]= {{1,2},{45},{10,20,30}};
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("ar["+i+"].length="+ar[i].length);
		}
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				System.out.print("ar["+i+"]["+j+"]="+ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
