package com.Collections.Set;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {

		// ex:3
//
//		// It will print descending order
//		if (i1 > i2) {
//			return -1;
//		} else if (i1 < i2) {
//			return +1;
//		}else {
//		return 0;
//		}

		// ex:4

		// return i1.compareTo(i2);// ascendinng order
		// return -i1.compareTo(i2);// descending order
		// return i2.compareTo(i1);// descending order
		// return -i2.compareTo(i1);// ascending order
		// return -1; // return reverse of isertion order
		// return +1; // return insertion order
		return 0;// it will take only one root element and take remaining elements duplicate

	}

}

class Mycomparator2 implements Comparator<String> {

	@Override
	public int compare(String i1, String i2) {

//		String s1=i1;
//		String s2=i2;

		// return i1.compareTo(i2);// return ascending order
		return -i1.compareTo(i2);// return descending order

	}

}

class MyCompartaor3 implements Comparator<String> {

	@Override
	public int compare(String i1, String i2) {
		String s1 = i1.toString();
		String s2 = i2.toString();
		return s1.compareTo(s2);// exception classcast exception
	}

}

class Employee implements Comparable<Object> {

	private int id;
	private String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {

		// By ascending order by Name
		String name1 = this.name;
		String name2 = ((Employee) o).name;
		// return name1.compareTo(name2);// ascending order
		return -name1.compareTo(name2);// descending order

		// asecending order by id
//		int edi1=this.id;
//		int edi2=((Employee)o).id;
//		if(edi1>edi2) {
//			return +1;
//		}else if(edi1<edi2) {
//			return -1;
//		}else {
//		
//		return 0;
//		}
	}

}

class MyComparator4 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.compareTo(o2);
	}

	
	

}

public class TreeSetFromSet {

	public static void main(String[] args) {

		// EX:7 using of objects insert in db

		Employee e1 = new Employee(101, "chandra");
		Employee e2 = new Employee(102, "sekhar");
		Employee e3 = new Employee(103, "lingisetti");
		Employee e4 = new Employee(104, "tcs");

		TreeSet t5 = new TreeSet<>(new MyComparator4());
		t5.add(e1);
		t5.add(e2);
		t5.add(e3);
		t5.add(e4);
		System.out.println(t5);

		// Ex:6
		TreeSet t4 = new TreeSet<>(new MyCompartaor3());
//		t4.add(new StringBuffer("A"));
//		t4.add(new StringBuffer("B"));
//		t4.add(new StringBuffer("k"));
//		t4.add(new StringBuffer("I"));
//		t4.add(new StringBuffer("L"));
//		t4.add(new StringBuffer("C"));
//		System.out.println(t4);

		// EX:5

		TreeSet t3 = new TreeSet<>(new Mycomparator2());
//		t3.add("Chandra");
//		t3.add("sekhar");
//		t3.add("lingisetti");
//		t3.add("tcs");
//		System.out.println(t3);

//		// ex:3 using of comparator
//		TreeSet t2 = new TreeSet<>(new MyComparator());
//		t2.add(10);
//		t2.add(90);
//		t2.add(34);
//		t2.add(54);
//		t2.add(30);

		// System.out.println(t2);

		// If we are depending on default natural sorting order then internally
		// Ex: JVM will use compareTo() method to arrange objects in sorting order.
//
//		System.out.println("A".compareTo("B"));
//		System.out.println("B".compareTo("C"));
		// System.out.println("C".compareTo("D"));
		// System.out.println("D".compareTo(new Integer(10)));
		// compareTo(java.lang.String) in java.lang.String cannot be applied to
		// (java.lang.Integer)

		// System.out.println("D".compareTo(null));// null Pointer exception

		TreeSet t = new TreeSet<>();
		t.add("chandra");
		t.add("sekhar");
		t.add("tcs");
		t.add("wipro");
		// System.out.println(t);
		// t.add(10);// class cast exception
//
//		Null acceptance:
//			*  For the empty TreeSet as the 1st element "null" insertion is possible but after 
//			   inserting that null if we are trying to insert any other we will get 
//			   NullPointerException.
//			*  For the non empty TreeSet if we are trying to insert null then we will get 
//			   NullPointerException.

		// t.add(null);// Null pointer exception
		// System.out.println(t);

		// Ex:2
		TreeSet t1 = new TreeSet<>();
//		t1.add(new StringBuffer("A"));
//		t1.add(new StringBuffer("B"));
//		t1.add(new StringBuffer("C"));

		// System.out.println(t1);
	}
}
