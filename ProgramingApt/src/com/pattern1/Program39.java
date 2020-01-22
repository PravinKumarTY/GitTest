package com.pattern1;
/*
         1  
      1  2  1  
   1  2  3  2  1  
1  2  3  4  3  2  1  
*/
public class Program39
{

	public static void main(String[] args) 
	{
		int n=4;
		for (int i = 0; i < n; i++)
		{
			int count=1;
			for (int j = 0; j < n-1-i; j++) 
			{
				System.out.print("   ");
			}
			for (int num = 0; num<=2*i; num++) 
			{
				if(num<i)
					System.out.print(count+++"  ");
				else
					System.out.print(count--+"  ");
			}
			System.out.println();
		}

	}

}
