package com.alphabet.pattern;
/*
  P  P  P  P  P  P  P   
  P                    P
  P                    P
  P                    P
  P                    P
  P                    P
  P                    P
  P  P  P  P  P  P  P   
  P                     
  P                     
  P                     
  P                     
  P                     
  P                     
  P     
 */
public class PPattern
{

	public static void main(String[] args)
	{
		int n=15;
       for(int i=0; i<n; i++)
       {
    	   for(int j=0;j<=n/2; j++)
    	   {
    		   if(j==0||(i==0&&j!=n/2)||(j==n/2&&i<=n/2&&i!=0&&i!=n/2)||(i==n/2&&j!=n/2))
    			   System.out.print("  P");
    		   else
    			   System.out.print("   ");
    	   }
    	   System.out.println();
       }
	}

}
