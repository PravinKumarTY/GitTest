package com.string1;

public class Test {
	public static void main(String[] args) {
		MyInterface i1=()->
		{
			System.out.println("this is my Method");
		};
		//Object obj=new Object();
		/*MyInterface i2=(Object obj)->
		{
			
		};*/
		i1.myMethod();
		i1.equals(args);
	}

}
