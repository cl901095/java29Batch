package com.Collections.Map;

import java.util.IdentityHashMap;

public class IdentityHashMap1 {

	public static void main(String[] args) {

		IdentityHashMap ih = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		ih.put(i1, "chandra");
		ih.put(i2, "sekhar");
		System.out.println(ih);
	}

}
