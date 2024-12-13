package com.methods;

public class Returnevenarraynumber {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Returnevenarraynumber a=new Returnevenarraynumber();
		a.evennumbers(arr);
		
	}
	 
	public void evennumbers(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.println(ar[i]);
			}
			
		}
	}

}
