package com.multiThreadingSynchonization;

public class Main {
	
	public static void main(String[] args) {
	
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();
		
		Demo2 d2=new Demo2();
		Thread t2=new Thread(d2);
		t2.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Method");
		}
	}

}
