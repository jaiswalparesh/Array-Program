/*Program to find the pair of numbers in an array whose sum is equal to a given number.

Step:
1. Create a HashSet to store the elements of the array.
2. Iterate through the array and for each element, calculate the difference between the target sum and the current element.
3. Check if the difference exists in the HashSet.
4. If it exists, print the pair of numbers.
5. If it does not exist, add the current element to the HashSet.

Example:
Input: arr[] = {4,6,5,-10,8,5,20}, sum = 10
Output: 6,4
        5,5
        20,-10

*/
package com.array.prac;

import java.util.HashSet;
import java.util.Set;

public class FindPairOfGivenSum {
	public static void main(String[] args) {
		int arr [] = {4,6,5,-10,8,5,20};
		int sum  = 10;
		
		//Create a HashSet to store the elements of the array.
        Set<Integer> set  = new HashSet<>();
        //Iterate through the array and for each element, calculate the difference between the target sum and the current element.
        for(int i : arr) {
            int result = sum - i;//Check if the difference exists in the HashSet.
            if(set.contains(result)) {//If it exists, print the pair of numbers.
                System.out.println("Pair is:" + i +" : "+ result);//If it does not exist, add the current element to the HashSet.
            } else {
                set.add(i);//If it does not exist, add the current element to the HashSet.
            }
        }	
	}
}
