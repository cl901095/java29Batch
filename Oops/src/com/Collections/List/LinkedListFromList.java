package com.Collections.List;

import java.util.LinkedList;

public class LinkedListFromList {
	
	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList();
		l.add("chandra");
		l.add("sekhar");
		System.out.println(l);
		
	// Methods total 6
	
	// 1. void addFirst(Object o);
		
		l.addFirst("Lingisetti");
		System.out.println(l);
		
	//2. void addLast(Object o);

		l.addLast("tcs");
		
	//3. Object getFirst();
		System.out.println(l.getFirst());
		
	// 4. Object getLast();
		System.out.println(l.getLast());
		
	// 5. Object removeFirst();
		System.out.println(l.removeFirst());
		System.out.println("after removal of first object :  "+l);
		
	// 6. Object removeLast();
		System.out.println(l.removeLast());
		System.out.println("after removal of last element  "+l);
		
	}

}
