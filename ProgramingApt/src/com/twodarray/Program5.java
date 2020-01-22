package com.twodarray;
/*Write a program to print number in clock wise cyclic order
 1 2 3 4 5 
16 17 18 19 6 
15 24 25 20 7 
14 23 22 21 8 
13 12 11 10 9 
*/
public class Program5 
{
	public static void main(String[] args)
	{
       int count=1;
       int ar[][]=new int[5][5];
      /* for (int i = 0; i <4; i++) 
       {
		    ar[0][i]=count++;
	   }
       for (int i = 0; i <4; i++)
       {
		  ar[i][4]=count++;
	   }
       for (int i = 4; i>0; i--) 
       {
		 ar[4][i]=count++;
	   }
       for (int i = 4; i >0; i--) 
       {
		 ar[i][0]=count++;
	   }
       for (int i = 1; i <3; i++)
       {
    	   ar[1][i]=count++;
	   }
       for (int i = 1; i < 3; i++)
       {
		 ar[i][3]=count++;
	   }
       for (int i = 3; i >1; i--) 
       {
		 ar[3][i]=count++;
	   }
       for (int i = 3; i > 1; i--) 
       {
		 ar[i][1]=count++;
	   }*/
       for (int start=0,end=ar.length-1; start<end; start++,end--)
       {
    	   for (int i = start; i <end; i++) 
           {
    		    ar[start][i]=count++;
    	   }
           for (int i = start; i <end; i++)
           {
    		  ar[i][end]=count++;
    	   }
           for (int i = end; i>start; i--) 
           {
    		 ar[end][i]=count++;
    	   }
           for (int i = end; i >start; i--) 
           {
    		 ar[i][start]=count++;
    	   }
	   }
       if(ar.length%2!=0)
       {
    	   ar[ar.length/2][ar.length/2]=count++;
       }
       for (int i = 0; i < ar.length; i++)
       {
		   for (int j = 0; j < ar[i].length; j++)
		   {
			   System.out.print(ar[i][j]+" ");
		   }
		   System.out.println();
	   }
	}
}
