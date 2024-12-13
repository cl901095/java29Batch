package com.blocksinjava;

public class StaticBlock {
	
	public StaticBlock() {
		System.out.println("this is constructor");
	}
	
	public void data() {
		System.out.println("this is instance method");
	}
	
	static {
		System.out.println("this is static block");
	}
	
	{
		System.out.println("this is non static block");
	}
	public static void main(String[] args) {
		System.out.println("this is main method block");
		
		
		
		StaticBlock e=new StaticBlock();
		e.data();
		
		
	}

}
