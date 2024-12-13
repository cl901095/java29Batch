package com.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorFromList {

	public static void main(String[] args) {

//		To add objects:

//		1. add(Object o);-----Collection

		Vector v = new Vector();
		v.add(10);
		v.add("chandra");
		v.add(20);

		System.out.println(v);

//	 2.add(int index,Object o);-----List 

		v.add(1, "chandra");
		v.add(2, "sekhar");

		System.out.println(v);

//	3.addElement(Object o);-----Vector 

		v.addElement("gopi");

		System.out.println(v);

//		To remove elements:

//		1. remove(Object o);--------Collection

		v.remove("sekhar");
		System.out.println(v);

//		2. remove(int index);--------------List 

		v.remove(2);
		System.out.println(v);

//		3. removeElement(Object o);----Vector

		v.removeElement(10);
		System.out.println(v);

//	   4. removeElementAt(int index);-----Vector

		v.removeElementAt(2);
		System.out.println(v);

//	   5.removeAllElements();-----Vector 
//	   v.removeAll(v);
		System.out.println(v);

//	   6.. clear();-------Collection

//	   v.clear();
		System.out.println(v);

//	   Other Methods

//	   1. . Int size();//How many objects are added

		System.out.println(v.size());

//	   2.Int capacity();//Total capacity

		System.out.println(v.capacity());
		
		System.out.println("================================================");
		
		
//      3. Enumeration elements();
		
		
		
		Vector<Integer> v1=new Vector<>();
		
		for(int i=1;i<=10;i++) {
			v1.addElement(i);
		}
		
		Enumeration e=v1.elements();
		
		while(e.hasMoreElements()) {
			Integer i=(Integer) e.nextElement(); // type casting
			if(i%2==0)
			
			System.out.println(i);
		}
		
		System.out.println("================================================");
		
		
		
//		Vector v=new Vector(int initialcapacity, int incrementalcapacity);


		Vector v2 = new Vector(10, 5);// default cpacity is 10 when it reaches 10 it will increase with 5 
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);
		v2.add(10);

		System.out.println(v2.capacity());

	}

}
