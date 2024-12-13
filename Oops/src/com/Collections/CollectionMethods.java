package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionMethods {

	public static void main(String[] args) {

		// collection has in 12 buit methods

		// 1. add Method
		List s = new ArrayList();
		s.add(10);
		s.add(20);
		s.add(90);
		s.remove(1);
		System.out.println(s);

		// 2. addAll Method

		List s1 = new ArrayList();
		s1.add("chandra");
		s1.add("sekhar");
		s1.add("lingisetti");
		s1.remove(1);
		System.out.println(s1);

		s1.addAll(s);
		System.out.println(s1);

		// 3. remove Method

		s1.remove(1);
		System.out.println(s1);

		// 4. removeAll Method

		// s1.removeAll(s1);
		System.out.println(s1);

		// 5. retainAll Method
		s1.retainAll(s);
		System.out.println(s1);

		// 6.clear Method
//		s1.clear();
//		System.out.println(s1);

		// 7.contain Method
		System.out.println(s1.contains(10));

		// 8. containsAll Method
		System.out.println(s1.containsAll(s));

		// 9. isEmpty Method
		System.out.println(s1.isEmpty());

		// 10. size Method
		System.out.println(s1.size());

		// 11. Object[] toArray();

		// 12. . Iterator iterator();

	}

}
