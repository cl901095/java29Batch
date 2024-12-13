package com.methods;

public class ReturnMaxElement {
	
	public static void main(String[] args) {
		int [] arr= {23,4,5,78,6,89};
		
		ReturnMaxElement e=new ReturnMaxElement();
		int data=e.findMaxElement(arr);
		System.out.println(data);
		
		
	}
	
	public int findMaxElement(int[] ar) {
		int max=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		return max;
		
	}

}
