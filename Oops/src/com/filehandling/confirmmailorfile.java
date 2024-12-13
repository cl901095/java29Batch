package com.filehandling;

import java.io.File;

public class confirmmailorfile {
	public static void main(String[] args) {
		
		// Find out file or directory in a specific folder
		File f=new File("D:\\Vtalent");
		   String [] array=f.list();
		   
		   for(String name:array) {
			   File f1=new File(f,name);
//			   if(f1.isFile()) {
//				   System.out.println(f1);
//			   }
			   if(f1.isDirectory()) {
				   System.out.println("folders ===========");
				   System.out.println(f1);
			   }
		   
	}

}
}
