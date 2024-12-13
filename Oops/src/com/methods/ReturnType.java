package com.methods;

public class ReturnType {
	
	public static void main(String[] args) {
		
		ReturnType r=new ReturnType();
		Employee emp=r.add(1);
		System.out.println("id "+emp.id+" name "+emp.name+" company  "+emp.company);	
	}
	
	public Employee add(int id) {
		Employee e=new Employee();
		e.id=101;
		e.name="chandra";
		e.company="tcs";
		return e;
	}

}
