package com.twodarray;

import java.util.Scanner;

public class FindConsecutive {
	public static void findConsecutive(int []x)
	{
		int res[]=sort(x);
		int x1[]=new int[x.length];
		int c=0;
		for (int i = 0; i < res.length-1; i++) {
			if(res[i]+1==res[i+1])
			{
				x1[c++]=res[i];
			}
			else
			{
				x1[c++]=res[i];
				break;
			}
		}
		for (int i = 0; i <c; i++) {
			System.out.print(" "+x1[i]);
		}
	}
	public static int[] sort(int x[])
	{
		for (int  i = 0;  i < x.length-1;  i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		return x;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		System.out.println("Enter array ");
		int []ar=new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		findConsecutive(ar);
	}
}
