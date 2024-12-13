package com.multiThreadingSynchonization;

public class Demo2 extends Thread{
	
	public void run() {
		System.out.println("Method 2");
		
		synchronized (this) {
			System.out.println("this code is in synchronised 1");
			System.out.println("This code is in synchronised 2");
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("From Demo2");
		}
		
		
	}

}
