/*
Problem Statement: Given an array and a sum k, generate the subarray whose elements sum to k .
We can use a sliding window to find the subarray summing to k.The idea is to expand the window by moving the right pointer and keep adding elements to the sum. If the sum exceeds k, we shrink the window from the left by moving the left pointer and subtracting elements. When the sum equals k, we return that window’s subarray.
1. Initialize two pointers, left and right, both at 0.
2. Initialize a running sum to 0.
3. Move right pointer, adding elements to the running sum.
4. If running sum exceeds k, move left pointer forward, subtracting elements from the sum.
5. When running sum equals k, return the subarray between left and right.
6. If no such subarray found, return empty result.

ref: https://takeuforward.org/data-structure/subarray-with-given-sum
*/

package com.array.prac;

public class ContinuousSubArrray {
	public static void main(String[] args) {
        int arr [] = {1, 7, 3, 9};//o/p: 7,3
        int sum = 10;

        // Find and print any contiguous subarray(s) that sum to the target value.
        findSubArrayForSum(arr, sum);
    }

    private static void findSubArrayForSum(int[] arr, int sum) {
        int left = 0;           // left end of the current window
        int runningSum = 0;     // sum of elements in the current window

        for (int right = 0; right < arr.length; right++) {
            // Expand the window to include arr[right]
            runningSum += arr[right];

            // If the sum exceeds the target, shrink the window from the left.
            while (runningSum > sum && left <= right) {
                runningSum -= arr[left];
                left++;
            }

            // When the running sum equals the target, print the current subarray.
            if (runningSum == sum) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("Can not find any subarray for the given sum");
    }
}
