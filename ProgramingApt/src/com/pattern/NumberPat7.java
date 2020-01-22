package com.pattern;

public class NumberPat7 {

	public static void main(String[] args) {
		int n=4;
		int count=1;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; i+j>=n-1; j++)
			{
					System.out.print(count--+" ");
			}
			System.out.println();
			count=count+2*i+3;
		}
	}

}
