package com.Collections.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap<>();
		tm.put(1, "chandra");
		tm.put(2, "sekhar");
		tm.put(3, "lingisetti");
		System.out.println(tm);
		// tm.put("sekhar", 1);// class cast esxception
		System.out.println(tm);
	}

}

//class MyComparator implements Comparator {
//	public int compare(Object obj1, Object obj2) {
//		String s1 = obj1.toString();
//		String s2 = obj2.toString();
//		return s2.compareTo(s1);
//	}
//}
