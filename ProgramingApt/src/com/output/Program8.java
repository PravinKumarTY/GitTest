package com.output;

public class Program8 {
   /* void methodOfTest(int i)
    {
    	System.out.println(1);
    }
    void methodOfTest(Integer I)
    {
    	System.out.println(2);
    }
    void methodOfTest(Object o)
    {
    	System.out.println(3);
    }*/
	public void maxMin(int x[])
	{
		int sumMax=0;
		int sumMin=0;
		int max=x[0];
		int min=x[0];
		for (int i = 0; i < x.length; i++) {
			if(max<x[i])
			{
				max=x[i];
			}
			if(min>x[i])
			{
				min=x[i];
			}
		}
		for (int i =0; i <x.length; i++) {
			if(min!=x[i])
			{
				sumMax=sumMax+x[i];
			}
		}
		for (int i=0; i <x.length; i++) {
			if(max!=x[i])
			{
				sumMin=sumMin+x[i];
			}
		}
		System.out.println(max + " " + min);
		System.out.println(sumMin+" "+sumMax);
	}
	public static void main(String[] args) {
		new Program8().maxMin(new int[] {1,2,3,4,5});
	}

}
