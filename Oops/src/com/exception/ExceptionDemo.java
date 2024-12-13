package com.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		try {
			String s=null;
			s.length();
		}catch(Exception e) {
			System.out.println("catch block");
		}
	}

}
