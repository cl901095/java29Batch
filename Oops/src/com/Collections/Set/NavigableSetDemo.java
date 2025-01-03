package com.Collections.Set;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);

//		       Methods
//		       1. ceiling(e); 
//		       It returns the lowest element which is >=e
	        	System.out.println(t.ceiling(800));

//		       2. higher(e);
//		       It returns the lowest element which is >e.

		        System.out.println(t.higher(1000));
//		        
//		        3. floor(e); 
//		        It returns highest element which is <=e
		        
		        System.out.println(t.floor(3000));
		        
//		        4. lower(e); 
//		        It returns height element which is <e.
		        
		        System.out.println(t.lower(2000));
//		        
//		        5. pollFirst ();
//		        Remove and return 1st element
		        System.out.println(t.pollFirst());
		        
//		        6. pollLast ();
//		        Remove and return last element
		        System.out.println(t.pollLast());
		        
//		        7. descendingSet ();
//		        Returns SortedSet in reverse order
		        System.out.println(t.descendingSet());
		        
		        System.out.println(t);
	}

}
