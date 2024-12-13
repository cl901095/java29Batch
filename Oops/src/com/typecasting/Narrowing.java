package com.typecasting;

public class Narrowing {
	public static void main(String[] args) {
		long l=9381233489l;
		int i=(int)l;
		System.out.println(i);
		
		Object obj="sekhar";
		String s=(String) obj;// this narrowing object to string
		System.out.println(s);
		
		
		String a="10";
		Integer i1=Integer.parseInt(a);// converting String to integer
		System.out.println(i1);
		
	}

}
