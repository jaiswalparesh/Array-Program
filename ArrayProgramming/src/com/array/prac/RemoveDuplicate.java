package com.array.prac;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr [] = {1, 1, 2, 2, 3, 4, 5};
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j< arr.length;j++) {
				if(arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
