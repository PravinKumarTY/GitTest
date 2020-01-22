package com.output;
abstract class X
{
	int i=11;
	int methodOfX()
	{
		return i*= i /= i; 
	}
	abstract void methodTwoOfX(int i);
}
class Y extends X
{
	public void methodTwoOfX(int i)
	{
		System.out.println(i);
	}
}
public class Program1 {

	public static void main(String[] args) {
		Y y1=new Y();
		//y1.methodTwoOfX(y1.methodOfX());
		int a=y1.methodOfX();
		System.out.println(a);
	}
}
