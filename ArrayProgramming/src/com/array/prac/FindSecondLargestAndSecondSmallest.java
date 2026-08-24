/* 
Program to find the largest and second largest number in an array 
and also the smallest and second smallest number in an array.
Example:
Input: arr[] = {1, 2, 4, 7, 7, 5}
Output:
Large: 7 Second Large is:5
Smallest: 1 Second Smallest is:2

Steps:
1. Create a local variable as large, sceondLarge, small and secondSmall to store the value and i and j to iterrate over it.
2. For finding large and second large :
    - initalize large with Integer.MIN_VALUE, secondLarge with Integer.MIN_VALUE
    - initialize i with 0
    - iterate over an array and check the array element greater then large if it is then assign secondLarge with large and large with array element
    - else if array element is greater then secondLargest then assign that element with secondLarge.
    - increment i variable
3. For finding small and second small :
    - initalize smallest with Integer.MAX_VALUE and secondSmallest with Integer.MAX_VALUE.
    - initialize j with 0
    - iterate over an array and check the array element smaller then small if it is then assign secondSmall with small and small with array element
    - else if array element is greater then secondSecond then assign that element with secondSmall.
    - increment j variable
4. return large, sceondLarge, small and secondSmall
*/

package com.array.prac;

public class FindSecondLargestAndSecondSmallest {

	public static void main(String[] args) {
		int arr [] = {1, 2, 4, 7, 7, 5};
        // initalize large with Integer.MIN_VALUE, secondLarge with Integer.MIN_VALUE
		int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int i = 0; // initialize i with 0
		while(i < arr.length) { // iterate over an array
            if(arr[i] > large) { // check the array element greater then large if it is then assign secondLarge with large and large with array element
                secondLarge = large;
                large = arr[i];
            } else if(arr[i] < large && arr[i] > secondLarge) { // else if array element is greater then secondLargest then assign that element with secondLarge.
                secondLarge = arr[i];
            }
            i++; // increment i variable
        }
        System.out.println("Large: " + large + " Second Large is:" + secondLarge);

        //initalize smallest with Integer.MAX_VALUE and secondSmallest with Integer.MAX_VALUE.
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int j = 0;//initialize j with 0
        while(j < arr.length) { // iterate over an array
            if(arr[j] < smallest) { // check the array element smaller then small if it is then assign secondSmall with small and small with array element
                secondSmallest = smallest;
                smallest = arr[j];
            } else if(arr[j] < secondSmallest && arr[j] > smallest) { // else if array element is greater then secondSecond then assign that element with secondSmall.
                secondSmallest = arr[j];
            }
            j++; //increment j variable
        }

        System.out.println("Smallest: " + smallest + " Second Smallest is:" + secondSmallest);
    }
}
