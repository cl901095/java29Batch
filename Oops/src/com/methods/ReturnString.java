package com.methods;

public class ReturnString {
	
	
	public static void main(String[] args) {
		ReturnString rs=new ReturnString();
		String data=rs.m1("chandra sekhar");
		System.out.println(data);
		
	}
	
	public String m1(String name) {
		return name.toUpperCase();
	}

}
