package com.array1;

public class Program1 {

	public static void main(String[] args) {
       String []s1=new String[3];
       s1[0]="java";
       s1[1]="hello";
       s1[2]="how";
       System.out.println("s1.length="+s1.length);
       for (int i = 0; i < s1.length; i++) {
		 System.out.println("s1["+i+"]="+s1[i]);
	   }
       System.out.println("args.length="+args.length);
       for (int i = 0; i < args.length; i++) {
		 System.out.println("args["+i+"]="+args[i]);
	   }
	}
}
