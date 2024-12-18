package com.Collections.Set;

import java.util.TreeSet;

public class TreeSetFromSet {

	public static void main(String[] args) {

		TreeSet t = new TreeSet<>();
		t.add("chandra");
		t.add("sekhar");
		t.add("tcs");
		t.add("wipro");
		System.out.println(t);
		// t.add(10);// class cast exception
//
//		Null acceptance:
//			*  For the empty TreeSet as the 1st element "null" insertion is possible but after 
//			   inserting that null if we are trying to insert any other we will get 
//			   NullPointerException.
//			*  For the non empty TreeSet if we are trying to insert null then we will get 
//			   NullPointerException.
		
		t.add(null);// Null pointer exception
		System.out.println(t);
	}
}
