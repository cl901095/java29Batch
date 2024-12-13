package com.multiThreading;

public class Demo  extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("wipro"+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);// 5 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
