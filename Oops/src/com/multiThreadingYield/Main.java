package com.multiThreadingYield;

public class Main {
	public static void main(String[] args) {
		
		
		Thread producer=new Thread() {
			public void run() {
				for(int i=0;i<3;i++) {
					System.out.println("produced");
					Thread.yield();
				}
			}
		};
		
		producer.setPriority(10);
		
		Thread consumer=new Thread() {
			public void run() {
				for(int i=0;i<3;i++) {
					System.out.println("consumer");
					Thread.yield();
				}
			}
		};
		
		consumer.setPriority(5);
		
		Thread consumer2=new Thread() {
			public void run() {
				for(int i=0;i<3;i++) {
					System.out.println("consumer2");
					Thread.yield();
				}
			}
		};
		consumer2.setPriority(10);
		
		producer.start();
		consumer.start();
		consumer2.start();
		
	}

}
