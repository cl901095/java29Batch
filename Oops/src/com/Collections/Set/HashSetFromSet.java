package com.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetFromSet {

	public static void main(String[] args) {

		// Default initial capacity 16

		Set l = new HashSet();
		l.add(10);
		l.add(10);
		l.add(null);
		l.add(null);

		System.out.println(l);

		HashSet l2 = new HashSet(6, .5f); // capcity 6+6 * 50 %= 9
		l2.add("chandra");
		l2.add("sekhar");
		l2.add("lingisetti");
		l2.add("tcs");
		l2.add("wipo");
		l2.add("congizant");
		System.out.println(l2);
		System.out.println("size f the Hashset  : " + l2.size());
	}

}
