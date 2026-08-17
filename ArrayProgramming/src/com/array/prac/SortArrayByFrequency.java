/*
Problem Statement: Given an array of integers, having some duplicate elements, sort the array by frequency .
Example:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4 
Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

Input: N = 6, array[] = {-199,6,7,-199,3,5}
Output: -199 -199 3 5 6 7
Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.

Steps:
1. Traverse the array and count frequency of each element using a hash map.
2. Convert the array into a list of elements.
3. Sort the list using a custom comparator:
   - First sort by decreasing frequency.
   - If frequencies are equal, sort by increasing value.
4. Return the sorted result.

link: https://takeuforward.org/data-structure/sort-elements-of-an-array-by-frequency
*/
import java.util.*;

import java.util.stream.Collectors;

public class SortArrayByFrequency {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 2, 4, 3, 1, 2};
        // Map to store frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        // Count frequency of each element
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // Convert array to list for sorting
        List<Integer> asList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        // Sort using custom comparator
        Collections.sort(asList, (a, b) -> {
            if(!map.get(a).equals(map.get(b))) {
                return map.get(b)-map.get(a);
            }
            return a-b;
        });
        // Convert list back to array
        arr = asList.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
