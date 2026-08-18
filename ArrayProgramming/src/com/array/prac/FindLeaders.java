/*
Program to Find Leaders in an Array
Example 1:
Input:
 arr = [4, 7, 1, 0]  
Output:
 7 1 0  
Explanation:
 The rightmost element (0) is always a leader.  
7 and 1 are greater than the elements to their right, making them leaders as well.

Example 2:
Input:
 arr = [10, 22, 12, 3, 0, 6]  
Output:
 22 12 6  
Explanation:
 6 is a leader because there are no elements after it.  
12 is greater than all the elements to its right (3, 0, 6), and 22 is greater than 12, 3, 0, 6, making them leaders as well.

Steps:
1. Set a variable max to the last element of the array (nums[sizeOfArray - 1]), as the last element is always a leader.
2. Create an empty list ans to store the leader elements, and initially add the last element of the array to this list, as it is always a leader.
3. Start from the second last element (index = sizeOfArray - 2) and move towards the first element (index = 0).
4. For each element, compare it with the max variable. If the current element is greater than max, add this element to the ans list and update max to the current element.
5. After processing all elements, the ans list will contain all the leader elements in reverse order. Reverse the ans list and return it.

link: https://takeuforward.org/data-structure/leaders-in-an-array
*/

package com.array.prac;

public class FindLeaders {
	public static void main(String[] args) {
		int[] arr = {10, 22, 12, 3, 0, 6};
        int length = arr.length;
        //Set a variable max to the last element of the array (arr[length - 1]), 
        // as the last element is always a leader
        int max = arr[length-1];
        //Create an empty list to store the leader elements
        List<Integer> list = new ArrayList<>();
        // initially add the last element of the array to this list, as it is always a leader
        list.add(arr[length-1]);
        //Start from the second last element (index = length - 2) and move towards the first element (index = 0).
        for(int i = length-2; i >= 0; i--) {
            //For each element, compare it with the max variable. 
            if(arr[i] > max) {
                 // If the current element is greater than max, add this element to the list
                list.add(arr[i]);
                //update max to the current element
                max = arr[i];
            }
        }
        //After processing all elements, the list will contain all the leader elements in reverse order. 
        // Reverse the list and return it.
        Collections.reverse(list);
        arr = list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(arr));
    }
	}
}
