package com.array.prac;

public class FindMinMaxAlternative {
	public static void main(String[] args) {
		//int[] arr = {5,4,6,8,1};
		int arr[] = {8,1,9,5,6};
		int max = 0;
		int min = 0;
		if(arr[0] > arr [1]) 
		{
			max = arr[0];
			min = arr[1];
		}
		if(arr[1]> arr[0]) {
			max = arr[1];
			min = arr[0];
		}
		
		for(int i = 2; i< arr.length; i++) {
			if(arr[i] > max) {
				max= arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("max is "+ max);
		System.out.println("min is " + min);
	}
}
