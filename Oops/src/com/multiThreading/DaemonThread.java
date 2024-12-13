package com.multiThreading;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("this thread is daemon");
		}else {
			System.out.println("this thread is normal threead");
		}
		
	}
	
	
	public static void main(String[] args) {//main Thread has priority 5 default
		DaemonThread d=new DaemonThread();
		Thread t=new Thread(d);
		t.setDaemon(true);
		t.start();
	}

}
