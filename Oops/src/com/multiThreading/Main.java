package com.multiThreading;

public class Main {
	public static void main(String[] args) throws InterruptedException {// Thread 1
		Thread.currentThread().setName("Parent Thread");
		
		Demo d= new Demo();
		Thread t=new Thread(d);// Thread 2 by using extends Thread class
		t.setName("chandra");
		t.start();

		Demo2 d2=new Demo2();
		Thread t2=new Thread(d2);// Thread 3 by implements Runnable interface
		t2.setName("Sekhar ");
		t2.start();
		
		
		for(int i=0;i<5;i++) {
			System.out.println(" tcs");
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(5000);
		}
		
	
	}
}
