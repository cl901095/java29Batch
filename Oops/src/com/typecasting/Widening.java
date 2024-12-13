package com.typecasting;

public class Widening {
	public static void main(String[] args) {
		byte i=10;
		int j=(int)i;
		System.out.println(j);
		
		String s="chandra";
		
		Object obj=s;
		System.out.println(obj);// string parent class is object so it is called widening
	}

}
