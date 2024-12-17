package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
		// it has three methods

		ArrayList a = new ArrayList();

		for (int i = 10; i <= 100; i = i + 10) {
			a.add(i);

		}
		System.out.println(a);

//		1. public boolean hasNext(); Method

		Iterator itr = a.iterator();
		while (itr.hasNext()) {

//		2.  public object next(); method

			System.out.println(itr.next());
		}

		System.out.println("=================================================");

		ArrayList a1 = new ArrayList();

		for (int i = 1; i <= 10; i++) {
			a1.add(i);

		}
		System.out.println(a1);

		Iterator itr2 = a1.iterator();
		while (itr2.hasNext()) {
			Integer i = (Integer) itr2.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {

//		3. public void remove();

				itr2.remove();
			}
		}

		System.out.println("---------------------------------");

		List l = new ArrayList();

		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		
		
		
		

		ListIterator ltr = l.listIterator();
		
//		 1.public boolean hasNext();

		while (ltr.hasNext()) {
			
//		2. public Object next(); forward

			Integer i = (Integer) ltr.next();
			System.out.print(i);
			
//			8. public void set(Object new), it will effect of next interations set is used to update the data
			
			if(i==7) {
				ltr.set(70);
			
			}
			

		}
		
		ltr.add(20);
		System.out.println("=======================");
		
		
		System.out.println();
		
//		3. public int nextIndex();
		
		System.out.println(ltr.nextIndex());

//		4. public boolean hasPrevious();
		
		while (ltr.hasPrevious()) {
			
//		5. public Object previous(); backward
			
			Integer i = (Integer) ltr.previous();
			System.out.print(i);
		}
		System.out.println();
		
//		6. public int previousIndex();
		
		System.out.println(ltr.previousIndex());

	}

}
