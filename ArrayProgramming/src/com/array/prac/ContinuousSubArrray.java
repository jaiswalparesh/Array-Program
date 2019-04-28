package com.array.prac;

public class ContinuousSubArrray {
	public static void main(String[] args) {
		int arr [] = {12,5,31,13,21,8};
		int sum = 49;
		ContinuousSubArrray arrray= new ContinuousSubArrray();
		arrray.findCountinuousSubArray(arr, sum);
	}

	private void findCountinuousSubArray(int[] arr, int sum) {
		int start = 0;
		int tempSum = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			
			while(tempSum > sum && start < i-1) {
				tempSum = tempSum-arr[start];
				start++;
			}
			
			if(tempSum == sum) {
				for(int j = start; j<i;j++) {
					System.out.println(arr[j]);
				}
			}
			
			if(i<arr.length) {
				tempSum = tempSum + arr[i];
			}
		}
		
	}
	

}
