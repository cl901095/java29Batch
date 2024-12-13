package com.wrapperclasses;

public class Demo {
	
	public static void main(String[] args) {
		
		int a=10;
		Integer d=new Integer(a);// Primitive data type to wrapper class
		System.out.println(d);
		
		int b=d;
		System.out.println(b); // wrapper class to primitive data type
	}

}
