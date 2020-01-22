package com.string1;

import java.util.Scanner;

public class FindAge {
    public static String findAge(String s1,String s2)
    {
    	String []date1=s1.split("/");
    	String []currDate=s2.split("/");
    	int dd=Integer.parseInt(date1[0]);
    	int mm=Integer.parseInt(date1[1]);
    	int yy=Integer.parseInt(date1[2]);
    	int cdd=Integer.parseInt(currDate[0]);
    	int cmm=Integer.parseInt(currDate[1]);
    	int cyy=Integer.parseInt(currDate[2]);
    	int tdd=0;
    	int tmm=0;
    	int tyy=0;
    	if(cdd>=dd)
    	{
    		tdd=cdd-dd;
    	}
    	else
    	{
    		cdd=cdd+30;
    		tdd=cdd-dd;
    		cmm=cmm-1;
    	}
    	if(cmm>=mm)
    	{
    		tmm=cmm-mm;
    	}
    	else
    	{
    		cmm=cmm+12;
    		tmm=cmm-mm;
    		cyy=cyy-1;
    	}
    	tyy=cyy-yy;
    	return ""+tyy+" years "+tmm+"  months "+tdd+" days";
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date of birth:");
		String preDate=sc.next();
		System.out.println("Enter current Date");
		String currDate=sc.next();
		String resdate=findAge(preDate,currDate);
		System.out.println("Your age is :"+resdate);
	}
}
