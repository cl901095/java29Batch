package com.multiThreading;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {

	@Override
	public String call() throws Exception {
	 System.out.println("this thread is Callable ");
		return "success";
	}

}
