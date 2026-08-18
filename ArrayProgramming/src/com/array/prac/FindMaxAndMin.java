/*Program to Find Maximum and Minimum Elements in an Array

Example:
Input: arr[] = {10, 22, 12, 3, 0, 6}
Output: Max: 22 Min: 0

Steps to Find Maximum and Minimum Elements in an Array:
1. Create a variable to store the maximum and minimum value of the array and initialize them to the minimum and maximum possible integer values respectively.
2. Iterate through the array and update the max and min variables accordingly.
*/
package com.array.prac;

public class FindMaxAndMin {
	public static void main(String[] args) {
		 int arr[] = {10, 22, 12, 3, 0, 6};
        //create a variable to store the maximum and minimum value of the array
        //and initialize them to the minimum and maximum possible integer values respectively
        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        //iterate through the array and update the max and min variables accordingly
        for (int i : arr) {
            if(i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        //print the maximum and minimum values of the array
        System.out.println("Max: " + max + " Min: " + min);
}
