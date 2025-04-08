package com.Collections.queue;

import java.util.PriorityQueue;

public class ProrityQueue1 {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue<>();

//		Queue interface methods:
//			1. boolean affer(Object o); 
//			To add an object to the Queue.

		q.offer(10);
		q.offer(20);
		q.offer(15);
		q.offer(30);
		q.offer(5);
		q.offer(100);
		System.out.println(q);
		
//		2. Object poll() ; 
//		To remove and return head element of the Queue, if Queue is empty then we will 
//		get null.
		
		System.out.println(q.poll());
		System.out.println(q);
		
//		4. Object peek(); 
//		To return head element of the Queue without removal, if Queue is empty this 
//		method returns null.
		
		System.out.println(q.peek());
		System.out.println(q);
		
//		5. Object element(); 
//		It returns head element of the Queue and if Queue is empty then it will raise 
//		Runtime Exception saying NoSuchElementException.
		
		System.out.println(q.element());
		System.out.println(q);

	}

}
