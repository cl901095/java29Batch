package com.filehandling;

import java.io.File;

public class DeleteFiles {

	public static void main(String[] args) {
		
//		// Delete a file in local directory
//		File f=new File("D:\\Vtalent\\chandra.txt");
//			boolean s=f.delete();
//			System.out.println(s);
//			
//	// Delete a file in IDE
//		File f=new File("chandrs.txt");
//		boolean s=f.delete();
//		System.out.println(s);
//		
//		
		
//	// Delete a file in folder in IDE
//		File f=new File("Sekhar\\sekhar.txt");
//		boolean s=f.delete();
//		System.out.println(s);
		
 // Deleting a floder in IDE
		
		File f = new File("Sekhar");
		boolean s=f.delete();
		System.out.println(s);
		
	}
}
