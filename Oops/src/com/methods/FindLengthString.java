package com.methods;

public class FindLengthString {
	
	public static void main(String[] args) {
		String name="LINGISETTI CHANDRA SEKHAR";
		FindLengthString l=new FindLengthString();
		int a=l.findLength(name);
		System.out.println("Length of string  =  "+a);
		
	}
	
	public int findLength(String data) {
		int number=data.length();
		return number;
	}

}
