package com.iostream;


import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferReader {
	public static void main(String[] args) throws IOException {
//		
//	// Reading the file line by line by using of Bufferedreader
		FileReader fr=new FileReader("temp\\chandra.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
			
		}
		
	
	}

}
