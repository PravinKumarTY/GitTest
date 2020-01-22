package com.output;
public class Program7 {
    int m;
    double n;
    public Program7(int i)
    {
    	m=i;
    }
    public Program7(double d)
    {
    	n=d;
    }
    {
    	System.out.println(m);
    	System.out.println(n);
    }
	public static void main(String[] args) {
		Program7 p1=new Program7(500);
		Program7 p2=new Program7(50.0);
		System.out.println(p1.m+":"+p1.n);
		System.out.println(p2.m+":"+p2.n);
	}

}
