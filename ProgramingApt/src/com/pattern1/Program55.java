package com.pattern1;
/*
  1 *   2 *   3 *   4 *   5
  11 *   12 *   13 *   14 *   15
  21 *   22 *   23 *   24 *   25
  16 *   17 *   18 *   19 *   20
  6 *   7 *   8 *   9 *   10
 */
public class Program55 {

	public static void main(String[] args) {
		int n=5;
		int count=1;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j<2*n-1; j++) {
			    if(j%2!=0)
			    {
			    	System.out.print(" * ");
			    }
			    else
			    {
			    	System.out.print("  "+count++);
			    }
			}
			if(i==n-2)
				count=6;
			if(i==0)
				count=count+5;
			if(i==n-3)
			   count=16;
			if(i==1)
				count=21;
			System.out.println();
		}
	}
}
