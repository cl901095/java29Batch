package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		
//      # file creation
		
//		File f=new File("chandrs.txt");
//		try {
//		boolean s=	f.createNewFile();
//		System.out.println(s);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
		
//	//  Creating new file in specific location
		
		File f=new File("D:\\Vtalent\\chandra.txt");
		try {
		boolean s=f.createNewFile();
		System.out.println(s);
	      } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	// Creating new file in Specific directory in IDE
		
//		File f=new File("temp","chandra.txt");
//		try {
//			boolean s=f.createNewFile();
//			System.out.println(s);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
