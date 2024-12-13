package com.multiThreadingAnonymousBlock;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

	public static void main(String[] args) {
		Thread t1=new Thread() {// annonymous block
			public void run() {
				System.out.println("run method  thread ");
			}
		};
		t1.start();
		System.out.println(t1.getClass().getName());// to know the anonymous class name
		
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("call method  runnable");	
			}	
		};
		Thread t2=new Thread(r);
		t2.start();
		System.out.println(r.getClass().getName());
		
		Callable c=new Callable() {

			@Override
			public Object call() throws Exception {
				System.out.println("method of callable");
				return null;
			}
			
		};
		
		ExecutorService es= Executors.newFixedThreadPool(1);
		es.submit(c);
		System.out.println(c.getClass().getName());
		
		
	}
}
