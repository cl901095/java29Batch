package com.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetFromSet {
	
	public static void main(String[] args) {
		
		Set l=new LinkedHashSet(5,.5f);
		
		l.add("sekhar"); // insertion is preserved means how what order we insert it will print as same order it is
		l.add("chandra");
		l.add("lingisetti");
		System.out.println(l);
	}

}
