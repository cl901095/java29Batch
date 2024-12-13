package com.methods;

public class ReturnSumOfArray {
	public static void main(String[] args) {
		int arr[]= {23,45,56,34,78,96};
		ReturnSumOfArray a=new ReturnSumOfArray();
		int result=a.addArray(arr);
		System.out.println(result);
		
	}

	public int addArray(int[] data) {
		int temp=0;
		for(int i=0;i<data.length;i++) {
			temp=temp+data[i];
		}
		return temp;
	}
	
}

