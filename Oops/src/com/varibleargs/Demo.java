package com.varibleargs;

public class Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.add(10,0);
		d.add(10,2,3,3,4,5,6,7,8,9);
		
	}

	public void add(int... x) {
		int sum=0;
		for(int a :x) {
			sum=sum+a;
		}
		System.out.println(sum);
	}
}
