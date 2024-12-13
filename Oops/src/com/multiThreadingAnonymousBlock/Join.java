package com.multiThreadingAnonymousBlock;

public class Join {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread() {
			 public void run() {
				 System.out.println("thread 1");
				 try {
					Thread.sleep(100);
					System.out.println("thread 1-2");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		};
		
		Thread t2=new Thread() {
			public void run() {
				System.out.println("thread 2");
				
				try {
					Thread.sleep(100);
					Thread.yield();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2-2");
			}
		};
		
		t1.start();
		t1.join();
		t2.start();
	}

}
