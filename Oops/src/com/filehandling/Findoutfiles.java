package com.filehandling;

import java.io.File;

public class Findoutfiles {
	public static void main(String[] args) {
		
	// find out how many files in local directory
		File f=new File("D:\\Vtalent");
		String [] name=f.list();
		boolean s=f.delete();
		System.out.println(s);
		for(String names: name) {
			System.out.println(names);
			
		}
   	
		}
}
