package com.Collections.Map;

import java.util.Hashtable;

public class HashtabaleFromMap {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable<>();
		ht.put(1, "chandra");
		ht.put(2, "sekhar");
		ht.put(3, "lingisetti");
		System.out.println(ht);
		
		
		int i=1/9;
		System.out.println(i);
		int j=1%9;
		System.out.println(j);
		int z=9%9;
		System.out.println(z);
		
//		Temp t=new Temp(0);
//
//		ht.put(new Temp(6), "A");
//		ht.put(new Temp(10), "B");
//		ht.put(new Temp(11), "C");
//		System.out.println(ht);

	}

}

//class Temp {
//	int i;
//
//	Temp(int i) {
//		this.i = i;
//
//	}
//
//	public int hashcode() {
//		return i;
//	}
//
//	public String toString() {
//		return i + " ";
//	}
//}
