package com.Collections.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ListArrayList {

	public static void main(String[] args) {

		List l = new ArrayList(); // default capacity is 10 it will increse New capacity=(current capacity*3/2)+1

		// 1.boolean add(int index,Object o); method
		l.add("tcs"); // index 0
		l.add(1, "chandra"); // index 1
		l.add(2, "sekhar"); // index 2
		l.add(3, "gopi");
		l.add(4, "nax");
		l.add(5, "chandrs");

		System.out.println(l);

		// 2. boolean addAll(int index,Collectio c)

		List l1 = new ArrayList();
		l1.add(10);
		l1.add(12);
		l1.add(13);
		l1.add(14);

		l1.addAll(l);
		System.out.println(l1);

		// 3. Object get(int index);

		System.out.println(l1.get(2));

		// 4.Object remove(int index);

		l1.remove(2);
		System.out.println(l1);

		// 5. Object set(int index,Object new);//to replace

		l1.set(2, 13);
		System.out.println(l1);

		// 6. Int indexOf(Object o);

		System.out.println(l1.indexOf(12));

		// 7. Int lastIndexOf(Object o);

		System.out.println(l1.lastIndexOf("chandra"));

		// 8. ListIterator listIterator();

		// Constructors
		ArrayList a = new ArrayList(10);
		System.out.println(a.size());

//		 * Usually we can use collection to hold and transfer objects from one tier to another 
//		   tier. To provide support for this requirement every Collection class already 
//		   implements Serializable and Cloneable interfaces.

//		 * ArrayList and Vector classes implements RandomAccess interface so that any 
//		   random element we can access with the same speed. Hence ArrayList is the best 
//		    choice of "retrival operation"

		ArrayList a1 = new ArrayList();
		LinkedList b1 = new LinkedList();

		System.out.println(a1 instanceof Serializable);
		System.out.println(b1 instanceof Serializable);

		System.out.println(a1 instanceof Cloneable);
		System.out.println(b1 instanceof Cloneable);

		System.out.println(a1 instanceof RandomAccess);
		System.out.println(b1 instanceof RandomAccess);
		
		
//		Collection==> is interface
//		Collections==> utility class
		
		
//		we need to synchorinze the ArrayList
		
		ArrayList a2=new ArrayList();// this is not a thread safe
		
		Collections.synchronizedList(a2); // This is thread safe now and shynchronized version
		
		
		
		

	}

}
