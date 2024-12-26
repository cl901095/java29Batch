package com.Collections.Map;

import java.util.WeakHashMap;

public class WeakHashMap1 {

	public static void main(String[] args) {
		
		WeakHashMap wh=new WeakHashMap();
		Temp t=new Temp();
		
		wh.put(t, "chandra");
		System.out.println(wh);
		
		t=null;
		try {
			Thread.sleep(5000);
			System.out.println(wh);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Temp{
	public String toString() {
		return " Temp";
	}
	public void finalize() {
		System.out.println("finalize method called");
	}
}