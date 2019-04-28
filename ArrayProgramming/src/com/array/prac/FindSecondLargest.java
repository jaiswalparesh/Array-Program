package com.array.prac;

public class FindSecondLargest {

	public static void main(String[] args) {
		int arr [] = {1,3,5,8,2,7};
		FindSecondLargest secondLargest = new FindSecondLargest();
		secondLargest.findSecondLargest(arr);
		 
	}

	//O(n)
	private void findSecondLargest(int[] arr) {
		int largest = 0;
		int secondLargest = 0;
		
		if(arr[0] > arr[1]){
			largest = arr[0];
			secondLargest = arr[1];
		}
		
		if(arr[1] > arr[0]){
			largest = arr[1];
			secondLargest = arr[0];
		}
		
		for(int i = 2; i< arr.length;i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("largest value " + largest);
		System.out.println("second largest valuue  " + secondLargest);
	}
}
