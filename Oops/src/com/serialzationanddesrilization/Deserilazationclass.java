package com.serialzationanddesrilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilazationclass {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		System.out.println("desrialixzation start");
		FileInputStream fi=new FileInputStream("sekhar.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object obj=oi.readObject();
		oi.close();
		Employee emp=(Employee) obj;
		System.out.println(emp.getEmployeeID()+" "+emp.getEmployeeName()+" "+emp.getEmployeeAddress()+" "+emp.getSlaray()+" "+emp.getCompany()+" "+emp.getPwd());
		System.out.println("desrilallzation completed");
	}

}
