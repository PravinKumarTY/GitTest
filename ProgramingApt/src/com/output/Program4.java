package com.output;
class OuterClass
{
	class InnerClassOne
	{
		class InnerClassTwo
		{
			class InnerClassThree
			{
				int i=10;
			}
		}
	}
}
public class Program4 {
	public static void main(String[] args) {
		System.out.println(new OuterClass().new InnerClassOne().new InnerClassTwo().new InnerClassThree().i);
	}

}
