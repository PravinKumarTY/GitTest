package com.pattern1;
/*
         1  
      1  2  1  
   1  2  3  2  1  
1  2  3  4  3  2  1  
   1  2  3  2  1  
      1  2  1  
         1  
*/

public class Program40
{
	public static void main(String[] args) 
	{
      int n=4;
      for (int i = 0; i <n; i++) 
      {
    	 int count=1;
		 for (int spaces= 0; spaces <n-1-i; spaces++)
		 {
			System.out.print("   ");
		 }
		 for (int num = 0; num<=2*i ; num++)
		 {
			if(num<i)
				System.out.print(count+++"  ");
			else
				System.out.print(count--+"  ");
	     }
		 System.out.println();
	  }
      for (int i = n-2; i >=0; i--)
      {
		 int count=1;
		 for (int spaces = 0; spaces<n-1-i; spaces++)
		 {
			System.out.print("   ");
		 }
		 for (int num = 0; num <=2*i; num++)
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
