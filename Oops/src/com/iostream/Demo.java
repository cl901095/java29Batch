package com.iostream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		
		// create a file and read that data 
		FileWriter f=new FileWriter("temp\\chandra.txt");
		f.write("Hi this chandra");
		f.write("\n");
		f.write("I am from TCS");
		f.flush();
		f.close();
		
	}

}
