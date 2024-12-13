package com.iostream;

import java.io.FileReader;

import java.io.IOException;

public class ReadData {
	public static void main(String[] args) throws IOException {
		
	// Read the file in spefic 
		FileReader fr=new FileReader("temp\\chandra.txt");
		  int i= fr.read();
		  while(i!=-1) {
			  System.out.print((char)i);
			  i=fr.read();
		  }
		
	}

}
