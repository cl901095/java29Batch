package com.exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		
		System.out.println("main methos started");
		try {
		String s="hello world";
		int n=s.length();
		System.out.println(n);
		}catch(Exception e) {
			System.out.println("ctach block");
		}
		
	}

}
