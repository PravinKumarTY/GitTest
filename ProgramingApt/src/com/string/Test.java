package com.string;
/*class Test1
{
	protected Test1()
	{
		System.out.println("this is test1");
	}
}*/
public class Test {
	static int i=3;
	static
	{
		i=i--+--i;
		System.out.println(i);
	}
	{
		i=i++-++i;
		System.out.println(i);
	}
	int method()
	{
		return i + i - i * i / i; 
	}
	
	public static void main(String... arg)
	{
		 System.out.println(new Test().method());
		//new Test();
	} 
}
