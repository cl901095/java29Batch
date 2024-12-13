package com.multiThreading;

public class Demo2 implements Runnable {

	@Override
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			System.out.println("infosys   =  "+Thread.currentThread().getName());
		}
		
	}

}
