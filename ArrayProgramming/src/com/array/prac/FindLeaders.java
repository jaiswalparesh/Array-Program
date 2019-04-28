package com.array.prac;

public class FindLeaders {
	public static void main(String[] args) {
		int [] arr= {12, 9, 7, 14, 8, 6, 3};
		int max = arr[arr.length-1];
		System.out.println(max);
		for(int i = arr.length-2; i>0; i--) {
			if(arr[i] > max) {
				System.out.println(arr[i]);
				max = arr[i];
			}
		}
	}
}
