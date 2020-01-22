package com.string1;

import java.util.Scanner;

public class SortDate {
    public static void  sort(String []date1)
    {
    	for (int i = 0; i < date1.length; i++) {
			for (int j = i+1; j < date1.length; j++) {
				if(Integer.parseInt(date1[i].substring(6,10))>Integer.parseInt(date1[j].substring(6,10))
					||(Integer.parseInt(date1[i].substring(6,10))==Integer.parseInt(date1[j].substring(6,10)))
					&&Integer.parseInt(date1[i].substring(3,5))>Integer.parseInt(date1[j].substring(3,5))
					||(Integer.parseInt(date1[i].substring(3,5))==Integer.parseInt(date1[j].substring(3,5)))
					&&Integer.parseInt(date1[i].substring(0,2))>Integer.parseInt(date1[j].substring(0,2)))
				{
					String temp=date1[i];
					date1[i]=date1[j];
					date1[j]=temp;
				}
			}
		}
    	for (int i = 0; i < date1.length; i++) {
			System.out.println(date1[i]);
		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array:");
        int size=sc.nextInt();
        String strDate[]=new String[size];
        System.out.println("Enter Array of dates:");
        for(int i=0; i<strDate.length; i++)
        {
        	strDate[i]=sc.next();
        }
        sort(strDate);
	}

}
