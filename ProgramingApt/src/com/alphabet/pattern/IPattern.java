package com.alphabet.pattern;
/*I  I  I  I  I  I  I
           I         
           I         
           I         
           I         
           I         
           I         
           I         
           I         
           I         
           I         
           I         
           I         
           I         
  I  I  I  I  I  I  I
 */

public class IPattern 
{
	public static void main(String[] args)
	{
		int n=15;
		for (int i = 0; i <n; i++)
		{
			for (int j = 0; j <n/2; j++) 
			{
				if(i==0||i==n-1||j==n/4)
					System.out.print("  I");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}
