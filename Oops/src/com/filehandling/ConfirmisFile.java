package com.filehandling;

import java.io.File;

public class ConfirmisFile {
	public static void main(String[] args) {
	
	// find folder is available in IDE by using id isDirectory method
		File f=new File("temp");
		if(f.isDirectory())
		{
			System.out.println("temp floder is avaliable");
		}
		
	// find file is available in IDE
		File f1=new File("temp\\chandra.txt");
		if(f1.isFile()) {
			System.out.println("chandra.txt file is availble");
		}
		

	}

}
