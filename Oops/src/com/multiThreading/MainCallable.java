package com.multiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainCallable {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CallableThread ct= new CallableThread();
		
		ExecutorService exservice= Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++) {
			Future submit=exservice.submit(ct);
			System.out.println(submit.get().toString());
		}
		exservice.shutdown();
	}

}
