package com.filehandling;

import java.io.File;

public class DeleteSpecficFile {
	public static void main(String[] args) {
		
	// delete particular file in local directory
		File f=new File("D:\\Vtalent");
		String [] a=f.list();
		
		for(String b:a) {
			File f1=new File(f,b);
			if(b.equals("chandra.txt")) {
				f1.delete();
			}
		}
	}

}
