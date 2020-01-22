package com.output;
class A
{
	static String s="AAA";
	static
	{
		s=s+"BBB";
	}
	{
		s="AAABBB";
	}
	{
		System.out.println(s);
	}
}
class B extends A
{
	static
	{
		s=s+"BBBAAA";
	}
	{
		System.out.println(s);
	}
}
public class Program2 {
	public static void main(String[] args) {
       A b=new A();
	}

}
