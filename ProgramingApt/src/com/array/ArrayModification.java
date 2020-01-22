package com.array;

import java.util.Scanner;

public class ArrayModification 
{
	public static int[] insert(int ar[],int ele,int pos)
	{
		if(pos>ar.length)
		{
			System.out.println("Invalid position:");
			return ar;
		}
		else
		{
			int []nar=new int[ar.length+1];
			nar[pos]=ele;
			for (int i = 0; i <pos; i++) 
			{
				nar[i]=ar[i];
			}
			for (int i = pos+1; i < nar.length; i++) 
			{
				nar[i]=ar[i-1];
			}
			return nar;
		}
	}
	public static int[] delete(int []ar,int pos)
	{
		if(pos>ar.length)
		{
			System.out.println("Invalid Position:");
			return ar;
		}
		else
		{
			int nar[]=new int[ar.length-1];
			for (int i = 0; i < pos; i++)
			{
				nar[i]=ar[i];
			}
			for (int i = pos; i < nar.length; i++)
			{
				nar[i]=ar[i+1];
			}
			return nar;
		}
	}
	public static int[] replace(int []ar,int ele,int pos)
	{
		if(pos>ar.length)
		{
			System.out.println("Invalid position");
			return ar;
		}
		else
		{
			ar[pos]=ele;
			return ar;
		}
	}
	public static int[] createArray()
	{
		System.out.println("Within create Array method:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int []ar=new int[size];
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println("Enter value at"+i+"position");
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public static void displayArray(int []ar)
	{
		System.out.println("The Array Elements:");
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println("ar["+i+"]="+ar[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ar[]=null;
		while(true)
		{
			System.out.println("Enter 1 to create Array");
			System.out.println("Enter 2 to insert");
			System.out.println("Enter 3 to delete");
			System.out.println("Enter 4 to replace");
			System.out.println("Enter 5 display array");
			System.out.println("Enter the choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			  case 1:
				  ar=createArray();
				  break;
			  case 2:
				  System.out.println("Enter the elements:");
				  int ele=sc.nextInt();
				  System.out.println("Enter the position");
				  int pos=sc.nextInt();
				  ar=insert(ar, ele, pos);
				  break;
			  case 3:
				  System.out.println("Enter the position");
				  int pos1=sc.nextInt();
				  ar=delete(ar, pos1);
				  break;
			  case 4:
				  System.out.println("Enter the elements");
				  int ele2=sc.nextInt();
				  System.out.println("Enter the position");
				  int pos2=sc.nextInt();
				  ar=replace(ar, ele2, pos2);
				  break;
			  case 5:
				  displayArray(ar);
				  break;
			}
			System.out.println("Do you wish to continue");
			String s1=sc.next();
			if(s1.equalsIgnoreCase("no"))
			{
				break;
			}
		}
	}
}
