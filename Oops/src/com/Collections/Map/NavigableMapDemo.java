package com.Collections.Map;

import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {

		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("a", "chandra");
		t.put("b", "sekhar");
		t.put("c", "Lingisetti");
		t.put("company", "tcs");

		System.out.println(t);

//		Methods
//		1. ceilingKey(e);
		System.out.println(t.ceilingKey("a"));

		// 2. higherKey(e)
		System.out.println(t.higherKey("b"));

		// 3. floorKey(e);
		System.out.println(t.floorKey("e"));

//		4. lowerKey(e);
		System.out.println(t.lowerKey("c"));

//		5. pollFirstEntry();
		System.out.println(t.pollFirstEntry());

//		6. pollLastEntry();
		System.out.println(t.pollLastEntry());

		// 7. descendingMap();
		System.out.println(t.descendingMap());

	}

}
