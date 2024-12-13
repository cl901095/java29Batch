package com.serialzationanddesrilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serliaztionclass {
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmployeeID(101);
		e.setEmployeeName("Chandra");
		e.setEmployeeAddress("Hyderabad");
		e.setSlaray(250000.00);
		e.setCompany("tcs");
		e.setPwd("lingisetti chandra sekhar");
		
		System.out.println("Serilazation is started");
		try {
			FileOutputStream fo=new FileOutputStream("sekhar.txt");
			try {
				ObjectOutputStream oo=new ObjectOutputStream(fo);
				oo.writeObject(e);
				oo.flush();
				oo.close();
				System.out.println("Serialzation completed");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
