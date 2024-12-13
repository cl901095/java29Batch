package com.methods;

public class ConcatOfString {
	public static void main(String[] args) {
		String a="chandra";
		String b="sekhar";
		
		ConcatOfString c=new ConcatOfString();
		String s=c.concatString(a, b);
		
		System.out.println(s);
	}
	public String concatString(String fname, String lname) {
		String name=fname+lname;
		return name;
		
	}

}
