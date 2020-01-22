package com.array1;

import java.util.Scanner;

public class Program12 {
	static Scanner sc=new Scanner(System.in);
    public static int[] insert(int a[],int ele,int pos)
    {
    	if(pos>a.length)
    	{
    		System.out.println("Invalid index:");
    		return a;
    	}
    	else
    	{
    	  int nar[]=new int[a.length+1];
    	  nar[pos]=ele;
    	  for (int i = 0; i < pos; i++) {
			nar[i]=a[i];
		   }
    	   for (int i =pos+1; i < nar.length; i++) {
			nar[i]=a[i-1];
		   }
    	   return nar;
    	}
    }
    public static int[] delete(int a[],int pos)
    {
    	if(pos>a.length)
    	{
    		System.out.println("Invalid Index:");
    		return a;
    	}
    	else
    	{
    	    int nar[]=new int[a.length-1];
    	    for (int i = 0; i <pos; i++) {
				nar[i]=a[i];
			}
    	    for (int i = pos; i < nar.length; i++) {
				nar[i]=a[i+1];
			}
    	    return nar;
    	}
    }
    public static int[] replace(int a[],int ele,int pos)
    {
    	a[pos]=ele;
    	return a;
    }
    public static int[] createArray(int s)
    {
    	int a[]=new int[s];
    	for (int i = 0; i < a.length; i++) {
			System.out.println("Enter"+i+"element");
			a[i]=sc.nextInt();
		}
    	return a;
    }
	public static void main(String[] args) {
		int a[]=null;
        System.out.println("Enter your choice:");
        while(true)
        {
        System.out.println("1.Insert element 2.Delete element 3.Replace element 4.Create An array 5.Display the Array");
        int choice=sc.nextInt();
        switch (choice) {
		case 1:
			System.out.println("Enter element to insert:");
			int ele=sc.nextInt();
			System.out.println("Enter position to insert:");
			int pos=sc.nextInt();
			int a1[]=insert(a, ele, pos);
			for (int i = 0; i < a1.length; i++) {
				System.out.print(" "+a1[i]);
			}
			break;
		case 2:
			System.out.println("Enter position to delete element:");
			int pos1=sc.nextInt();
			int a2[]=delete(a, pos1);
			for (int i = 0; i < a2.length; i++) {
				System.out.print(" "+a2[i]);
			}
			break;
		case 3:
			System.out.println("Enter element to replace:");
			int repe=sc.nextInt();
			System.out.println("Enter position to replace");
			int pos2=sc.nextInt();
			int a3[]=replace(a, repe, pos2);
			for (int i = 0; i < a3.length; i++) {
				System.out.print(" "+a3[i]);
			}
		    break;
		case 4:
			System.out.println("Enter size to create array:");
			int size=sc.nextInt();
			a=createArray(size);
			break;
		case 5:
			System.out.println("Array elements are:");
			for (int i = 0; i < a.length; i++) {
				System.out.print(" "+a[i]);
			}
			break;
		default:
			System.out.println("Invalid option:");
			break;
		}
        System.out.println();
        System.out.println("Would you like to continue:");
        String s1=sc.next();
        if(s1.equalsIgnoreCase("no"))
        {
        	break;
        }
        }
	}
}
