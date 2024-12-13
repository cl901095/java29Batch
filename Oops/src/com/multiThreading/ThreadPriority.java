package com.multiThreading;

public class ThreadPriority implements Runnable {

	@Override
	public void run() {
		System.out.println("Method Started :"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method Ended : "+Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {/// Thread 1 -->Main Thread also a thread// Default Prority 5
		
		System.out.println(Thread.currentThread().getPriority()); // find out main thread Priority
		
		ThreadPriority tp= new ThreadPriority();
		
		Thread t= new Thread(tp);         // Thread 2
	//	t.setPriority(Thread.MIN_PRIORITY);   // Priority
		t.setPriority(1);                    // Priority type                
		t.setName("Thread 2");
		t.start();							// going to Runnable state
		
		
		Thread t2=new Thread(tp);           // Thread 3
	//	t2.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(4);
		t2.setName("Thread 3");
		t2.start();
		
		
		Thread t3=new Thread(tp);			// Thread 4
	//	t3.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(10);
		t3.setName("thread 4");
		t3.start();
	}
	

}
