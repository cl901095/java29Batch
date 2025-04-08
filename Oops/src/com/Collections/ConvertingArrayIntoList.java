package com.Collections;

import java.util.Arrays;
import java.util.List;

public class ConvertingArrayIntoList {
	public static void main(String[] args) {
		
		String [] a= {"chandra","sekhar","lingisetti","tcs"};
		
		System.out.println(a);
		
		List<String> l= Arrays.asList(a);
		for(String a1 : a) {
			System.out.print(a1+"  ");
		}
	}

}
