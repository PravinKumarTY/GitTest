package com.twodarray;

public class Test {
	{
		System.out.println("this is block1");
	}
	public Test() {
		System.out.println("this is defaultconstructor");
	}
	{
		System.out.println("this is block2");
	}
	public Test(int x)
	{
		System.out.println("this is parameterized constructor="+x);
	}

	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test(10);
	}

}
