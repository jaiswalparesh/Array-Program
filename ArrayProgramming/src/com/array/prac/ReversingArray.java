package com.array.prac;

public class ReversingArray {
	public static void main(String[] args) {
		int arr [] = {1,5,3,4};
		
		ReversingArray array = new ReversingArray();
		array.reverse(arr);
	}

	private void reverse(int[] arr) {
		int temp = 0;
		for(int i = 0; i< arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
