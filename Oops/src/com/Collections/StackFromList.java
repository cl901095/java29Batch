package com.Collections;

import java.util.Stack;

public class StackFromList {

	public static void main(String[] args) {

//		Methods:
//			1. Object push(Object o);
//		To insert an object into the stack

		Stack s = new Stack();
		s.push(10);
		s.push("chandra");
		s.push("sekhar");
		s.push(20);
		s.push(30);
		System.out.println(s);

//		2. Object pop(); 
//		To remove and return top of the stack.

//		Whenever last in first out(LIFO) order required then we should go for Stack
//		whenever we are used pop method it is removed last insert elememt

		System.out.println(s.pop());

//		3. Object peek(); 
//		To return top of the stack without removal.

		System.out.println(s.peek());

//		4. boolean empty(); 
//		Returns true if Stack is empty.

		System.out.println(s.empty());

//		5. Int search(Object o); 
//		Returns offset if the element is available otherwise returns "-1"
		System.out.println(s.search(10));

	}

}
