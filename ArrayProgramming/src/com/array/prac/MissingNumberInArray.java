/* 
Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.


Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.  

We know that the summation of the first N numbers is (N*(N+1))/2. We can say this S1. Now, in the given array, every number between 1 to N except one number is present. So, if we add the numbers of the array (say S2), the difference between S1 and S2 will be the missing number. Because, while adding all the numbers of the array, we did not add that particular number that is missing.
Approach
We will first calculate the summation of first N natural numbers(i.e. 1 to N) using the specified formula.
Then we will add all the array elements using a loop.
Finally, we will consider the difference between the summation of the first N natural numbers and the sum of the array elements

Link: https://takeuforward.org/arrays/find-the-missing-number-in-an-array

Problem Statement: Find all missing number(between 1 to N), that is not present in the given array.

Example 1:
Input Format: N = 9, array[] = {2,5,4,1,6,8}
Result: 3,7
Explanation: In the given array, number 3,7 is missing. So, 3,7 is the answer.

*/
package com.array.prac;

import java.util.BitSet;

public class MissingNumberInArray {

	public static void main (String args[]) {
		System.out.println("Missing single number:");
        findSingleMissingNumber();
        System.out.println("Missing mutiple number:");
        findMultipleMissingNumber();
	}

	//Find the multiple missing number in an array.
	private static void findMultipleMissingNumber() {
		//Finding multiple missig value from an unorder array.
        int[] arr1 = {2,5,4,1,6,8};
        Arrays.sort(arr1);// Sort the given array
        int register[] = new int[9]; // create new array to store the element
        for(int i : arr1) {
            register[i] = 1;// iterate over an array and pass the element as index to new array and mark as 1
        }
        for(int i = 1; i < register.length;i++) { // iterate over an array and find the index value as zero 
            if(register[i] == 0) {
                System.out.println("missing number:" + i);// Print the missing number
            }
        }
		
	}
	//Finds the single missing number in an array.
	private static void findSingleMissingNumber() {
		int[] arr = {1, 2, 4, 5};
        int n = 5;
        int sum = n*(n+1)/2; // Calculate the sum of first N natural numbers
        int total = 0;
        for(int i = 0; i< n-1; i++) {
            total = total + arr[i]; // Calculate the sum of elements in the array
        }
        System.out.println("Missing value is : " + (sum - total));// Missing number is the difference
	}
}
