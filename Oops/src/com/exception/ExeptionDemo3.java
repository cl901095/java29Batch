package com.exception;

public class ExeptionDemo3 {
	
	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			int i=10/0;
			System.out.println("try block");
		}
//		}catch (Exception e) {
//			System.out.println("catch block excuted");
//		}
			finally {
			System.out.println("finaly block excuted");
		}
	}

}
