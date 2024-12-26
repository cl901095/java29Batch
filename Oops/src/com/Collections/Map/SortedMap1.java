package com.Collections.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1 {

	public static void main(String[] args) {

		SortedMap sh = new TreeMap<>();
		sh.put(1, "chandra");
		sh.put(2, "sekhar");
		sh.put(3, "lingisetti");
		System.out.println(sh);

		// 1. Object firsyKey()
		System.out.println(sh.firstKey());

		// 2.Object lastKey();
		System.out.println(sh.lastKey());

		// 3.SortedMap headMap(Object key);
		System.out.println(sh.headMap(3));
		
		// 4.SortedMap tailMap(Object key);
		System.out.println(sh.tailMap(1));
		
		// 5.SortedMap subMap(Object key1,Object key2);
		System.out.println(sh.subMap(1, 3));
		
		// 6`.Comparator comparator();
		
		
	}
}