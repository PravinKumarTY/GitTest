package com.pattern;
/*
         *
       *   *
     *       *
   *           *
     *       *
       *   *
         *
 */
public class Diamond 
{

	public static void main(String[] args)
	{
       int n=4;
       for(int i=0; i<4; i++)
       {
    	   for(int spaces=0; spaces<=n-1-i; spaces++)
    	   {
    		  System.out.print("  ");
    	   }
    	   for (int j = 0; j<=2*i; j++) 
    	   {
    		   if(j==0||j==2*i)
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
       for(int i=n-2; i>=0; i--)
       {
    	   for(int spaces=0; spaces<=n-1-i; spaces++)
    	   {
    		   System.out.print("  ");
    	   }
    	   for(int j=0; j<=2*i; j++)
    	   {
    		   if(j==0||j==2*i)
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
