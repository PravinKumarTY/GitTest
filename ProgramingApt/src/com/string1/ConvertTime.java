package com.string1;

import java.util.Scanner;

public class ConvertTime {
    public static String timeConvert(String time)
    {
    	String[] time_splite=time.split(":");
    	String hr=time_splite[0];
        int hh=Integer.parseInt(hr);
        String ampm=time_splite[2];
        String ampmc=Character.toString(ampm.charAt(2));
        if(ampmc.equals("P")&&hh!=12)
        {
        	hh=hh+12;
        	hr=""+hh;
        }
        else if(ampmc.equals("A")&&hh==12)
        {
        	hr="00";
        }
        String res=hr+":"+time_splite[1]+":"+Character.toString(ampm.charAt(0))+Character.toString(ampm.charAt(1));
        return res;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in String Format:");
        String time=sc.next();
        //07:45:35PM
        String convertedTime=timeConvert(time);
        System.out.println("Resultand Time:   "+convertedTime);
	}

}
