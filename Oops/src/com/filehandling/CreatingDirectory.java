package com.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingDirectory {
	public static void main(String[] args) throws IOException {
		
//    // Creating folder/directory		
//		File f=new File("Sekhar");
//		boolean s=f.mkdir();
//		System.out.println(s);
//	
//		// creating a file in specific directory
//		File f1=new File("Sekhar","sekhar.txt");
//		boolean s1=f1.createNewFile();
//		System.out.println(s1);
//		
//		
		
		// Creating nested directors
		File f=new File("temp\\temp\\temp\\temp");
		boolean s=f.mkdirs();
		System.out.println(s);
		
	}

}
