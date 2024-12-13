package com.exception;

public class ExceptionWithThrow {
	public static void main(String[] args) throws Exception {
		ExceptionWithThrow ex= new ExceptionWithThrow();
		String name=ex.getNmae(103);
		System.out.println(name);
		
	}
	
	
	public String getNmae(int id) throws Exception {
		if(id==101) {
			return "raju";
		}else if(id==102) {
			return "chandra";
		}else {
			throw new Exception("Inavalid id");	
		}
		
	}

}
