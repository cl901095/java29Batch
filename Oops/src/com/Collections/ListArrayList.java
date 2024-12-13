package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {

	public static void main(String[] args) {

		List l = new ArrayList();

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

	}

}
