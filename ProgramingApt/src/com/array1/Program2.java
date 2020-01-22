package com.array1;
import java.util.Scanner;
public class Program2 {
	public static int sum(int x[])
	{
		int sum=0;
		for (int i = 0; i < x.length; i++) {
			sum=sum+x[i];
		}
		return sum;
	}
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int size=sc.nextInt();
      //Declaring the array
      int a[]=new int[size];
      System.out.println("Enter array elements:");
      for (int i = 0; i <size; i++) {
    	  System.out.println("Enter element at"+i+"position");
		a[i]=sc.nextInt();
	  }
      int sum=sum(a);
      System.out.println("Sum of array="+sum);
	}

}
