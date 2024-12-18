package com.Collections.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetFromSet {

	public static void main(String[] args) {

		SortedSet<Integer> s = new TreeSet();
		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
		System.out.println(s);
		
	//	1. Object first();
		
		System.out.println(s.first());
		
	// 2. Object last();
		System.out.println(s.last());
		
	//3. 3. SortedSet headSet(Object obj); 
		// it will give before 14 elements
		System.out.println(s.headSet(14));
		
	// 4. SortedSet tailSet(Object obj); 
		// it will give after elements
		System.out.println(s.tailSet(12));
		
	// 5.SortedSet subset(Object o1,Object o2)
		// it is like substing  first element for starting index of element and second element is last index
		System.out.println(s.subSet(11, 14));

	// 6. Comparator comparator();
	}

}
