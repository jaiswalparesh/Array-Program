/* 
Problem Statement: Remove duplicates from an array

Example : a[]= {1, 1, 2, 2, 3, 4, 5}
output = [1,2,3,4,5]

Step:
1. Create an empty set
2. Iterate over an array and add them in the set
3. convert set to an array.
4. print the array
*/

package com.array.prac;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr [] = {1, 1, 2, 2, 3, 4, 5};
        Set<Integer> set = new HashSet<>();// Create an empty set
        for(int i : arr) { // Iterate over an array and add them in the set
            if(!set.contains(i)) {
                set.add(i);
            }
        }
        arr = set.stream().mapToInt(i->i).toArray();// convert set to an array
        System.out.println(Arrays.toString(arr)); // print the array
	}
}
