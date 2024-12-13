package com.multiThreadingSynchonization;

public class Demo implements Runnable {

	@Override
	public synchronized void run() {
	    System.out.println("method: 1");
		
	} 

}
