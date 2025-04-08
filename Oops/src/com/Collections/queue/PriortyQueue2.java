package com.Collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriortyQueue2 {
	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue(15, new MyComparator());
		q.offer(10);
		q.offer(5);
		q.offer(6);
		q.offer(1);
		q.offer(0);
		System.out.println(q);
	}

}

class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer s1 = (int) o1;
		Integer s2 = (int) o2;
		return s2.compareTo(s1);

	}

}
