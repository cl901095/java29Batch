package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionWithThrows {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr=new FileReader("abc.txt");
	}

}
