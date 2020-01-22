package com.alphabet.pattern;
/*
  K                    K
  K                 K   
  K              K      
  K           K         
  K        K            
  K     K               
  K  K                  
  K                     
  K  K                  
  K     K               
  K        K            
  K           K         
  K              K      
  K                 K   
  K                    K
*/
public class KPattern {

	public static void main(String[] args) 
	{
		int n=15;
       for(int i=0; i<n; i++)
       {
    	   for (int j =n/2; j <n; j++) 
    	   {
			   if(i==j||i+j==n-1||j==n/2)
				   System.out.print("  K");
			   else
				   System.out.print("   ");
		   }
    	   System.out.println();
       }
	}

}
