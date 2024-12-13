package com.methods;

public class PrintDataOfStudent {
	public static void main(String[] args) {
		
		Employee s=new Employee();
		s.id=1;
		s.name="chandra";
		s.company="tcs";
		
		PrintDataOfStudent p=new PrintDataOfStudent();
		p.data(s);
		
		
	}
	
	public void data(Employee e) {
		System.out.println(e.id+" "+e.name+" "+e.company);
	}

}
