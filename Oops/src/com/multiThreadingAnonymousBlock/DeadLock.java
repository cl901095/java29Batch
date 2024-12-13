package com.multiThreadingAnonymousBlock;

public class DeadLock {

	public static void main(String[] args) {
		
		String s1="hi";
		String s2="hello";
		
		Thread t1=new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("Thread lock 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s2) {// thread lock happen second one
						System.out.println("thread lock2 ");
					}
				     }
				
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println("thread 2-lock 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s1) {/// thread lock happen on second
						System.out.println("thread 3 lock 2");
					}
					
				     }
				
			}
		};
		
		t1.start();
		t2.start();
	}
}
